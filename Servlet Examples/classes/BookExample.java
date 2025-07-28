import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String ISBN;

    private static ArrayList<Book> bookCollection = new ArrayList<>();

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String get_Title() {
        return title;
    }

    public void set_Title(String title) {
        this.title = title;
    }

    public String get_Author() {
        return author;
    }

    public void set_Author(String author) {
        this.author = author;
    }

    public String get_ISBN() {
        return ISBN;
    }

    public void set_ISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void add_Book(Book book) {
        bookCollection.add(book);
    }

    public static void remove_Book(Book book) {
        bookCollection.remove(book);
    }

    public static ArrayList<Book> get_BookCollection() {
        return bookCollection;
    }
}

public class BookExample {
    public static void main(String[] args) {
        Book book1 = new Book("The C Programming Language", "Dennis Ritchie, Brian Kernighan", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");

        Book.add_Book(book1);
        Book.add_Book(book2);

        ArrayList<Book> bookCollection = Book.get_BookCollection();

        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }

        Book.remove_Book(book1);

        System.out.println("\nAfter removing " + book1.get_Title() + ":");
        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.get_Title() + " by " + book.get_Author() + ", ISBN: " + book.get_ISBN());
        }
    }
}
