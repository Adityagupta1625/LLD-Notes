package IteratorPattern;

import java.util.List;

public class BookIterator implements Iterator<Books> {

    private int index;
    List<Books> booksList;

    public BookIterator(List<Books> booksList) {
        this.booksList = booksList;
        this.index = 0;
    }

    public Books next() {
        if (hasNext()) {
            return booksList.get(index++);
        }
        return null;
    }

    public boolean hasNext() {
        return index < booksList.size();
    }

}
