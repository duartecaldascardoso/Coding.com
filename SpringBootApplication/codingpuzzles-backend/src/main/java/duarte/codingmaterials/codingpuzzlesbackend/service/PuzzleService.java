package duarte.codingmaterials.codingpuzzlesbackend.service;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;

import java.util.List;

public interface PuzzleService {

    PuzzleDto createPuzzle(PuzzleDto puzzleDto);

    PuzzleDto getPuzzleById(Long puzzleId);

    List<PuzzleDto> getAllPuzzles();
}
