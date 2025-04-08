package OnlineBookReaderSystem;

public class OnlineBookReaderSystem {

    private UserManager userManager;
    private Library library;
    private Display display;
    private User activeUser;
    private Book activeBook;

    public OnlineBookReaderSystem() {
        this.userManager = new UserManager();
        this.library = new Library();
        this.display = new Display();
    }

    public void setActiveUser(User user) {
        this.activeUser = user;
        this.display.setActiveUser(user);
    }

    public void setActiveBook(Book book) {
        this.activeBook = book;
        this.display.setActiveBook(book);
    }

    public User getActiveUser(User user) {
        return this.activeUser;
    }

    public Book getActiveBook(Book book) {
        return this.activeBook;
    }

    public UserManager getUserManager() {
        return this.userManager;
    }

    public Library getLibrary() {
        return this.library;
    }

    public Display getDisplay() {
        return this.display;
    }
}
