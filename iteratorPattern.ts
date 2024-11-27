// The Iterator Pattern is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.). It allows clients to access the elements of an aggregate object without providing its underlying representation.

// Problem: You have a collection of objects and you want to allow clients to access them without exposing how the collection is implemented. Or we want to have different traversals of the collection so instead of bombarding the client with a various methods for traversal we can maintain separate iterators for each traversal.

// Solution: we can have an interface iterators all iterator will implement this interface and we can use this interface to create various iterators traverse the collection.

// Structure:

// 1. iterator interface: This is the interface that all iterators must implement. It defines the methods that clients can use to traverse the collection. it has various methods for fetching next element, restarting iterator current position etc

// 2. concrete iterators: These are the iterators that implement the iterator interface. They contain the logic to traverse the collection.

// 3. collection interface: This is the interface that all collections must implement. It defines the methods that clients can use to create iterators over the collection.

// 4. concrete collections: These are the collections that implement the collection interface. They contain the collection of elements and provide methods to create iterators over the collection.

// 5. client: This is the client that uses the iterator pattern. It creates an iterator over the collection and uses it to traverse the collection.

interface IteratorDemo<T> {
  next(): T | null;
  hasNext(): boolean;
}

class Book {
  title: string;
  price: number;

  constructor(title: string, price: number) {
    this.title = title;
    this.price = price;
  }

  getTitle(): string {
    return this.title;
  }

  getPrice(): number {
    return this.price;
  }
}

class BookIterator implements IteratorDemo<Book> {
  private index: number = 0;
  private books: Book[] = [];

  constructor(books: Book[]) {
    this.books = books;
  }

  next(): Book | null {
    if (this.hasNext()) {
      return this.books[this.index++];
    }
    return null;
  }

  hasNext(): boolean {
    return this.index < this.books.length;
  }
}

class Library {
  books: Book[] = [];

  constructor(books: Book[]) {
    this.books = books;
  }

  getIterator(): IteratorDemo<Book> {
    return new BookIterator(this.books);
  }
}

const booksList: Book[] = [new Book("Book 1", 10), new Book("Book 2", 20)];

const library = new Library(booksList);
const iterator = library.getIterator();

while (iterator.hasNext()) {
  const book = iterator.next();
  console.log(book?.getTitle());
}
