package duarte.codingmaterials.codingpuzzlesbackend.repository;

import duarte.codingmaterials.codingpuzzlesbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
