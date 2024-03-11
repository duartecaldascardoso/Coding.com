package duarte.codingmaterials.codingpuzzlesbackend.service;


import duarte.codingmaterials.codingpuzzlesbackend.dto.UserDto;
import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(Long userId, UserDto userDto);

    void deleteUser(Long userId);

}
