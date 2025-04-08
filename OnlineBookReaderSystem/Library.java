package OnlineBookReaderSystem;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<Integer, Book> books;

    public Library() {
        this.books = new HashMap<Integer, Book>();
    }

    public Boolean addBook(Book book) {
        if (books.containsKey(book.getBookId())) {
            return false;
        }
        books.put(book.getBookId(), book);
        return true;
    }

    public void remove(int bookId) {
        books.remove(bookId);
    }

    public Book find(int bookId) {
        return books.get(bookId);
    }

    public String print() {
        String output = "";

        for (Book book : this.books.values()) {
            output += "Book Id: " + book.getBookId() +
                    "Book Title: " + book.getTitle() +
                    "Page Count: " + book.getPageCount()
                    + "\n";

        }
        return output;
    }
}
