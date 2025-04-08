package OnlineBookReaderSystem;

public class Display {

    private User activeUser;
    private Book activeBook;
    private int currentPage;

    public Display() {
        this.currentPage = 1;
    }

    public void setActiveBook(Book book) {
        this.activeBook = book;
    }

    public void setActiveUser(User user) {
        this.activeUser = user;
    }

    public void turnPageForward() {
        this.currentPage++;
        if (this.activeBook.getPageCount() < this.currentPage) {
            this.currentPage = this.activeBook.getPageCount();
        }

        System.out.println("Currently on page: " + this.currentPage);
    }

    public void turnPageBackward() {
        this.currentPage--;
        if (this.currentPage < 0)
            this.currentPage = 0;

        System.out.println("Currently on page: " + this.currentPage);
    }

    public void displayUser() {

        System.out.println("User Id: " + this.activeUser.getUserId() + " User Name: " + this.activeUser.getName());
    }

    public void displayBook() {
        System.out.println("Book Id: " + this.activeBook.getBookId() + " Book Title: " + this.activeBook.getTitle());
    }
}
