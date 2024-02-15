package duarte.codingmaterials.codingpuzzlesbackend.controller;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;
import duarte.codingmaterials.codingpuzzlesbackend.service.PuzzleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/puzzles")
public class PuzzleController {

    private PuzzleService puzzleService;

    /*
    REST API to create a brand-new puzzle
     */
    @PostMapping
    public ResponseEntity<PuzzleDto> createPuzzle(@RequestBody PuzzleDto puzzleDto){
        PuzzleDto savedPuzzle = puzzleService.createPuzzle(puzzleDto);
        return new ResponseEntity<>(savedPuzzle, HttpStatus.CREATED);
    }

    /*
    REST API to obtain a puzzle by the puzzle ID
     */
    @GetMapping("{id}")
    public ResponseEntity<PuzzleDto> getPuzzleById(@PathVariable("id") Long puzzleId){
        PuzzleDto puzzleDto = puzzleService.getPuzzleById(puzzleId);
        return ResponseEntity.ok(puzzleDto);
    }

    /*
    REST API to obtain all the available puzzles
     */
    @GetMapping
    public ResponseEntity<List<PuzzleDto>> getAllPuzzles(){
        List<PuzzleDto> puzzleList = puzzleService.getAllPuzzles();
        return ResponseEntity.ok(puzzleList);
    }
}
