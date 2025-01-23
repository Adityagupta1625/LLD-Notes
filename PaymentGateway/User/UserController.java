package PaymentGateway.User;

public class UserController {

    private UserService userService;

    public UserController() {
        this.userService = UserService.getInstance();
    }

    public void addUser(UserDO data) {
        userService.addUser(data);
    }

    public UserDO getUserById(String userId) {
        return userService.getUserById(userId);
    }
}
