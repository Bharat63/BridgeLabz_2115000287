import java.util.Scanner;

class Book {
    String title, author, genre;
    int id;
    boolean available;
    Book next, prev;
    Book(String title, String author, String genre, int id, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.available = available;
    }
}

class Library {
    private Book head, tail;
    
    void addBookAtBeginning(String title, String author, String genre, int id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }
    
    void addBookAtEnd(String title, String author, String genre, int id, boolean available) {
        Book newBook = new Book(title, author, genre, id, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }
    
    void removeBook(int id) {
        Book temp = head;
        while (temp != null && temp.id != id) temp = temp.next;
        if (temp == null) return;
        if (temp == head) head = head.next;
        if (temp == tail) tail = tail.prev;
        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }
    
    void searchBookByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
                return;
            }
            temp = temp.next;
        }
    }
    
    void searchBookByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equals(author)) {
                System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
            }
            temp = temp.next;
        }
    }
    
    void updateAvailability(int id, boolean available) {
        Book temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.available = available;
                return;
            }
            temp = temp.next;
        }
    }
    
    void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
            temp = temp.next;
        }
    }
    
    void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " " + temp.author + " " + temp.genre + " " + temp.id + " " + temp.available);
            temp = temp.prev;
        }
    }
    
    int countBooks() {
        int count = 0;
        Book temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        while (true) {
            System.out.println("1. Add Book Beginning 2. Add Book End 3. Remove Book 4. Search by Title 5. Search by Author 6. Update Availability 7. Display Forward 8. Display Reverse 9. Count Books 10. Exit");
            int choice = scanner.nextInt();
            if (choice == 10) break;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Title, Author, Genre, ID, Availability (true/false):");
                    library.addBookAtBeginning(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextBoolean());
                }
                case 2 -> {
                    System.out.println("Enter Title, Author, Genre, ID, Availability (true/false):");
                    library.addBookAtEnd(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextBoolean());
                }
                case 3 -> {
                    System.out.println("Enter Book ID to Remove:");
                    library.removeBook(scanner.nextInt());
                }
                case 4 -> {
                    System.out.println("Enter Book Title to Search:");
                    library.searchBookByTitle(scanner.next());
                }
                case 5 -> {
                    System.out.println("Enter Author to Search:");
                    library.searchBookByAuthor(scanner.next());
                }
                case 6 -> {
                    System.out.println("Enter Book ID and Availability (true/false):");
                    library.updateAvailability(scanner.nextInt(), scanner.nextBoolean());
                }
                case 7 -> library.displayBooksForward();
                case 8 -> library.displayBooksReverse();
                case 9 -> System.out.println("Total Books: " + library.countBooks());
            }
        }
        scanner.close();
    }
}
