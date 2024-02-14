package duarte.codingmaterials.codingpuzzlesbackend.service;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;

public interface PuzzleService {

    PuzzleDto createPuzzle(PuzzleDto puzzleDto);

    PuzzleDto getPuzzleById(Long puzzleId);
}
