package OnlineBookReaderSystem;

public class User {

    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setUser(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
