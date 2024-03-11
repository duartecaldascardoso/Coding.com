package duarte.codingmaterials.codingpuzzlesbackend.service.impl;

import duarte.codingmaterials.codingpuzzlesbackend.dto.UserDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.User;
import duarte.codingmaterials.codingpuzzlesbackend.exception.PuzzleNotFoundException;
import duarte.codingmaterials.codingpuzzlesbackend.mapper.UserMapper;
import duarte.codingmaterials.codingpuzzlesbackend.repository.UserRepository;
import duarte.codingmaterials.codingpuzzlesbackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    public static final String USER_NOT_FOUND_MESSAGE = "User not found with the defined id";


    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new PuzzleNotFoundException(USER_NOT_FOUND_MESSAGE));
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userList.stream().map((UserMapper::mapToUserDto)).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long userId, UserDto userDto) {
        User user = userRepository.findById(userId).orElseThrow(() -> new PuzzleNotFoundException(USER_NOT_FOUND_MESSAGE));

        user.setUsername(user.getUsername());
        user.setEloId(user.getEloId());
        user.setCountryId(user.getCountryId());
        user.setBirthDate(user.getBirthDate());

        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new PuzzleNotFoundException(USER_NOT_FOUND_MESSAGE));
        userRepository.delete(user);
    }
}
