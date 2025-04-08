package Uber.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Uber.DTO.UserDAO;
import Uber.Models.User;

public class UserManager {

    private List<User> users;
    private Map<String, Integer> userMap;

    public UserManager() {
        this.users = new ArrayList<User>();
        this.userMap = new HashMap<String, Integer>();
    }

    public void addUser(UserDAO user) {
        User newUser = new User();
        String userId = java.util.UUID.randomUUID().toString();
        newUser.setUserId(userId);
        newUser.setName(user.getName());
        newUser.setEmail(user.getEmail());
        users.add(newUser);
        userMap.put(userId, users.size() - 1);
    }

    public User getUser(String userId) {
        int index = userMap.get(userId);
        return users.get(index);
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
