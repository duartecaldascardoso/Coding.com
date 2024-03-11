package duarte.codingmaterials.codingpuzzlesbackend.mapper;

import duarte.codingmaterials.codingpuzzlesbackend.dto.UserDto;
import duarte.codingmaterials.codingpuzzlesbackend.entity.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user) {
        return new UserDto(user.getId(),user.getEloId(), user.getUsername(), user.getCountryId(), user.getBirthDate());
    }

    public static User mapToUser(UserDto userDto) {
        return new User(userDto.getId(),userDto.getEloId(), userDto.getUsername(), userDto.getCountryId(), userDto.getBirthDate());
    }
}
