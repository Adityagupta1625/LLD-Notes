package IteratorPattern;

public class Main {

    public static void main(String[] args) {

        Books b1 = new Books("Java", 100);
        Books b2 = new Books("C++", 200);
        Books b3 = new Books("Python", 300);

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        Iterator<Books> it = library.iterator();

        while (it.hasNext()) {
            Books book = it.next();
            if (book != null) {
                System.out.println(book.getBookName() + " " + book.getPrice());
            }
        }
    }
}
