import java.util.ArrayList;
import java.util.List;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId + ", Title: " + title + ", Author: " + author + 
                           ", Loan Duration: " + getLoanDuration() + " days");
    }
}

interface Reservable {
    boolean reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public boolean reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public boolean reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return isAvailable;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald"));
        libraryItems.add(new Magazine("M202", "National Geographic", "John Doe"));
        libraryItems.add(new DVD("D303", "Inception", "Christopher Nolan"));

        for (LibraryItem item : libraryItems) {
            item.getItemDetails();
        }
    }
}
