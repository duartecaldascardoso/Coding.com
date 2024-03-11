package duarte.codingmaterials.codingpuzzlesbackend.service.impl;

import duarte.codingmaterials.codingpuzzlesbackend.dto.UserDto;
import duarte.codingmaterials.codingpuzzlesbackend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public static final String USER_NOT_FOUND_MESSAGE = "User not found with the defined id";


    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getUserById(Long userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public UserDto updateUser(Long userId, UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }

    @Override
    public void deleteUsers() {

    }
}
