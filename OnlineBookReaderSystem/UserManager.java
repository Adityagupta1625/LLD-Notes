package OnlineBookReaderSystem;

import java.util.HashMap;
import java.util.Map;

public class UserManager {

    private Map<Integer, User> users;

    public UserManager() {
        this.users = new HashMap<Integer, User>();
    }

    public Boolean addUser(User user) {
        if (users.containsKey(user.getUserId())) {
            return false;
        }

        users.put(user.getUserId(), user);
        return true;
    }

    public void remove(int userId) {
        users.remove(userId);
    }

    public User find(int userId) {
        return users.get(userId);
    }
}
