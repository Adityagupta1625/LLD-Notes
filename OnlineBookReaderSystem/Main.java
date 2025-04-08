package OnlineBookReaderSystem;

public class Main {

    public static void main(String[] args) {
        OnlineBookReaderSystem onlineBookReaderSystem = new OnlineBookReaderSystem();

        UserManager userManager = onlineBookReaderSystem.getUserManager();

        Library library = onlineBookReaderSystem.getLibrary();

        Display display = onlineBookReaderSystem.getDisplay();

        userManager.addUser(new User(1, "Aditya"));
        userManager.addUser(new User(2, "Krishna"));

        library.addBook(new Book(1, "Physics", 100));

        library.addBook(new Book(2, "chemistry", 20));

        onlineBookReaderSystem.setActiveUser(userManager.find(2));

        onlineBookReaderSystem.setActiveBook(library.find(1));

        display.displayBook();
        display.displayUser();

        display.turnPageForward();
        display.turnPageForward();

        display.turnPageBackward();
    }
}
