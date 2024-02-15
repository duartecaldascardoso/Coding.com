package duarte.codingmaterials.codingpuzzlesbackend;

import duarte.codingmaterials.codingpuzzlesbackend.entity.Puzzle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CodingPuzzlesBackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void puzzleConstructorTest(){
		Puzzle puzzle = new Puzzle(1L,"What is the first position of an array?", "B");

		assert(puzzle.getId().equals(1L));
		assert(puzzle.getAnswer().equals("B"));
	}


}
