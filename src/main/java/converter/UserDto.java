package converter;

import java.util.StringJoiner;

/**
 * @author: rensiyu
 * @createTime: 2022/09/28
 */
public class UserDto {
    private String firstName;
    private String lastName;
    private boolean active;
    private String email;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, boolean active, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.email = email;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", UserDto.class.getSimpleName() + "[", "]").add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'").add("active=" + active).add("email='" + email + "'").toString();
    }
}
