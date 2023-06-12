import java.util.Iterator;
import java.util.List;

public class UserGroupIterator<T extends User> implements Iterator<T>{
    private int counter;
    private final List<T> users;

    public UserGroupIterator(UserGroup userGroup) {
        this.users = (List<T>) userGroup.getUsers();
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < users.size();
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw new RuntimeException("Teachers");
        }

        return users.get(counter++);
    }
}