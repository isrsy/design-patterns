package converter;

import java.util.Arrays;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Converter<UserDto, User> userConverter = new UserConverter();
        UserDto dtoUser = new UserDto("John", "Doe", true, "whatever[at]wherever.com");
        User user = userConverter.convertFromDto(dtoUser);
        log.info(user.toString());


        List<User> users = Arrays.asList(
                new User("Camile", "Tough", false, "124sad"),
                new User("Marti", "Luther", true, "42309fd"),
                new User("Kate", "Smith", true, "if0243")
                                        );

        List<UserDto> fromEntities = userConverter.createFromEntities(users);
        fromEntities.stream().map(UserDto::toString).forEach(log::info);
    }
}
