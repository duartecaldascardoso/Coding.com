package duarte.codingmaterials.codingpuzzlesbackend.controller;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;
import duarte.codingmaterials.codingpuzzlesbackend.service.PuzzleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
