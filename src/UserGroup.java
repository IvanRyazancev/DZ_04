import java.util.List;

public class UserGroup implements Iterable<User> {
    private List<User> users;

    public UserGroup(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "users=" + users +
                '}';
    }

    @Override
    public UserGroupIterator iterator() {
        return new UserGroupIterator(this);
    }
}