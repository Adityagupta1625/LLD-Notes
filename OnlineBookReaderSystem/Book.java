package OnlineBookReaderSystem;

public class Book {

    private int bookId;
    private String title;
    private int pageCount;

    public Book(int bookId, String title, int pageCount) {
        this.bookId = bookId;
        this.title = title;
        this.pageCount = pageCount;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
