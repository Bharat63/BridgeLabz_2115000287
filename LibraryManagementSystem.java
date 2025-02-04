import java.util.Scanner;

class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

public class LibraryManagementSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();
        Book book = new Book(title, author, isbn);
        book.displayBookDetails();
        Book.displayLibraryName();
        scanner.close();
    }
}
