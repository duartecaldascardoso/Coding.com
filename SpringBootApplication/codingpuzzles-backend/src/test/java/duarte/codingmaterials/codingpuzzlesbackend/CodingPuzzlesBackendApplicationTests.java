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
		Puzzle puzzle = new Puzzle(1L, "What is the first position of an array?", "B", "0");
		PuzzleDto puzzleDto = new PuzzleDto(1L, "What is the first position of an array?", "B", "0");

		assert (PuzzleMapper.mapToPuzzle(puzzleDto).getAnswer().equals(puzzle.getAnswer()));
		assert (PuzzleMapper.mapToPuzzleDto(puzzle).getAnswer().equals(puzzleDto.getAnswer()));
	}


}
