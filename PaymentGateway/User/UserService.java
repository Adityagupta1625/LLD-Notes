package PaymentGateway.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private static List<User> users = new ArrayList<>();
    private static UserService instance = null;

    public static UserService getInstance() {
        if (instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public UserService() {

    }

    public void addUser(UserDO data) {
        User user = new User();

        user.setName(data.getName());
        user.setUserId(data.getUserId());
        user.setEmail(data.getEmail());
        users.add(user);
    }

    private UserDO convertToUserDO(User user) {
        UserDO userDO = new UserDO();
        userDO.setName(user.getName());
        userDO.setUserId(user.getUserId());
        userDO.setEmail(user.getEmail());
        return userDO;
    }

    public UserDO getUserById(String userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return convertToUserDO(user);
            }
        }
        return null;
    }

}
