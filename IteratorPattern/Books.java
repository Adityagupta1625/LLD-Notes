package IteratorPattern;

public class Books {

    private String bookName;
    private int price;

    public Books(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
