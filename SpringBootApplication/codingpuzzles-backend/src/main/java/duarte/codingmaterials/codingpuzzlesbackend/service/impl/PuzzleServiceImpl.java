package duarte.codingmaterials.codingpuzzlesbackend.service.impl;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.Puzzle;
import duarte.codingmaterials.codingpuzzlesbackend.mapper.PuzzleMapper;
import duarte.codingmaterials.codingpuzzlesbackend.repository.PuzzleRepository;
import duarte.codingmaterials.codingpuzzlesbackend.service.PuzzleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class PuzzleServiceImpl implements PuzzleService {
    private PuzzleRepository puzzleRepository;


    @Override
    public PuzzleDto createPuzzle(PuzzleDto puzzleDto) {

        Puzzle puzzle = PuzzleMapper.mapToPuzzle(puzzleDto);
        Puzzle savedPuzzle = puzzleRepository.save(puzzle);

        return PuzzleMapper.mapToPuzzleDto(savedPuzzle);
    }
}
