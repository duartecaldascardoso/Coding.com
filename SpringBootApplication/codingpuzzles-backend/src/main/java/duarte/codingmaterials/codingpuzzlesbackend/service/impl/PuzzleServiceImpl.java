package duarte.codingmaterials.codingpuzzlesbackend.service.impl;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.Puzzle;
import duarte.codingmaterials.codingpuzzlesbackend.exception.PuzzleNotFoundException;
import duarte.codingmaterials.codingpuzzlesbackend.mapper.PuzzleMapper;
import duarte.codingmaterials.codingpuzzlesbackend.repository.PuzzleRepository;
import duarte.codingmaterials.codingpuzzlesbackend.service.PuzzleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PuzzleServiceImpl implements PuzzleService {
    private PuzzleRepository puzzleRepository;
    public static final String PUZZLE_NOT_FOUND_MESSAGE = "Puzzle not found with the defined id";

    @Override
    public PuzzleDto createPuzzle(PuzzleDto puzzleDto) {

        Puzzle puzzle = PuzzleMapper.mapToPuzzle(puzzleDto);
        Puzzle savedPuzzle = puzzleRepository.save(puzzle);

        return PuzzleMapper.mapToPuzzleDto(savedPuzzle);
    }

    @Override
    public PuzzleDto getPuzzleById(Long puzzleId) {
        Puzzle puzzle = puzzleRepository.findById(puzzleId).orElseThrow(()-> new PuzzleNotFoundException(PUZZLE_NOT_FOUND_MESSAGE));
        return PuzzleMapper.mapToPuzzleDto(puzzle);
    }

    @Override
    public List<PuzzleDto> getAllPuzzles() {
        List<Puzzle> puzzleList = puzzleRepository.findAll();
        return puzzleList.stream().map((PuzzleMapper::mapToPuzzleDto)).collect(Collectors.toList());
    }
}
