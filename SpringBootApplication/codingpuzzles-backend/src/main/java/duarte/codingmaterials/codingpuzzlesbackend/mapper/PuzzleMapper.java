package duarte.codingmaterials.codingpuzzlesbackend.mapper;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.Puzzle;

public class PuzzleMapper {

    public static PuzzleDto mapToPuzzleDto(PuzzleDto puzzleDto){
        return new PuzzleDto(puzzleDto.getId(), puzzleDto.getQuestion(), puzzleDto.getAnswer());
    }

    public static Puzzle mapToPuzzle(PuzzleDto puzzleDto){
        return new Puzzle(puzzleDto.getId(), puzzleDto.getQuestion(), puzzleDto.getAnswer());
    }
}
