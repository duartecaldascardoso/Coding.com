package duarte.codingmaterials.codingpuzzlesbackend;

import duarte.codingmaterials.codingpuzzlesbackend.dto.PuzzleDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.Puzzle;
import duarte.codingmaterials.codingpuzzlesbackend.mapper.PuzzleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodingPuzzlesBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void puzzleConstructorTest() {
        Puzzle puzzle = new Puzzle(1L, "What is the first position of an array?", "B", "0");

        assert (puzzle.getId().equals(1L));
        assert (puzzle.getAnswer().equals("B"));
        assert (puzzle.getAnswerString().equals("0"));
    }

	@Test
	public void puzzleMapperTest() {
		// Creating Puzzle and PuzzleDto objects
		Puzzle puzzle = new Puzzle(1L, "What is the first position of an array?", "B", "0");
		PuzzleDto puzzleDto = new PuzzleDto(1L, "What is the first position of an array?", "B", "0");

		//Mapping for answer
		assert (PuzzleMapper.mapToPuzzle(puzzleDto).getAnswer().equals(puzzle.getAnswer()));
		assert (PuzzleMapper.mapToPuzzleDto(puzzle).getAnswer().equals(puzzleDto.getAnswer()));

		//Mapping for id
		assert (PuzzleMapper.mapToPuzzle(puzzleDto).getId().equals(puzzle.getId()));
		assert (PuzzleMapper.mapToPuzzleDto(puzzle).getId().equals(puzzleDto.getId()));

		//Mapping for question
		assert (PuzzleMapper.mapToPuzzle(puzzleDto).getQuestion().equals(puzzle.getQuestion()));
		assert (PuzzleMapper.mapToPuzzleDto(puzzle).getQuestion().equals(puzzleDto.getQuestion()));

		//Mapping for answer string
		assert (PuzzleMapper.mapToPuzzle(puzzleDto).getAnswerString().equals(puzzle.getAnswerString()));
		assert (PuzzleMapper.mapToPuzzleDto(puzzle).getAnswerString().equals(puzzleDto.getAnswerString()));

	}



}
