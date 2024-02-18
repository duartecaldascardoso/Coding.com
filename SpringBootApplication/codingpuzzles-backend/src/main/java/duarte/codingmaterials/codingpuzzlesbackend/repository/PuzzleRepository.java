package duarte.codingmaterials.codingpuzzlesbackend.repository;

import duarte.codingmaterials.codingpuzzlesbackend.entity.Puzzle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuzzleRepository extends JpaRepository<Puzzle, Long> {

}
