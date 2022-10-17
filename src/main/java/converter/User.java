package converter;

/**
 * @author: rensiyu
 * @createTime: 2022/09/28
 */
public class User {
    private String firstName;
    private String lastName;
    private boolean active;
    private String userId;

    public User() {
    }

    public User(String firstName, String lastName, boolean active, String userId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.userId = userId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "User{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", active=" + active
                + ", userId='" + userId + '\'' + '}';
    }
}
