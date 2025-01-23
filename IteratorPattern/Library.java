package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Books> booksList;

    public Library() {
        this.booksList = new ArrayList<>();
    }

    public void addBook(Books book) {
        booksList.add(book);
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void removeBook(Books book) {
        booksList.remove(book);
    }

    public Iterator<Books> iterator() {
        return new BookIterator(booksList);
    }
}
