package duarte.codingmaterials.codingpuzzlesbackend.mapper;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.Puzzle;

public class PuzzleMapper {

    public static PuzzleDto mapToPuzzleDto(Puzzle puzzle){
        return new PuzzleDto(puzzle.getId(), puzzle.getQuestion(), puzzle.getAnswer());
    }

    public static Puzzle mapToPuzzle(PuzzleDto puzzleDto){
        return new Puzzle(puzzleDto.getId(), puzzleDto.getQuestion(), puzzleDto.getAnswer());
    }
}
