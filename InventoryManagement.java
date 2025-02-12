import java.util.Scanner;

class Item {
    String name;
    int id, quantity;
    double price;
    Item next;
    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    private Item head;
    
    void addItemAtBeginning(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        newItem.next = head;
        head = newItem;
    }
    
    void addItemAtEnd(String name, int id, int quantity, double price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newItem;
    }
    
    void removeItem(int id) {
        if (head == null) return;
        if (head.id == id) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.id != id) temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }
    
    void updateQuantity(int id, int quantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                temp.quantity = quantity;
                return;
            }
            temp = temp.next;
        }
    }
    
    void searchItemById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
                return;
            }
            temp = temp.next;
        }
    }
    
    void searchItemByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equals(name)) {
                System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
                return;
            }
            temp = temp.next;
        }
    }
    
    void displayTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();
        while (true) {
            System.out.println("1. Add Item Beginning 2. Add Item End 3. Remove Item 4. Update Quantity 5. Search by ID 6. Search by Name 7. Display Total Value 8. Exit");
            int choice = scanner.nextInt();
            if (choice == 8) break;
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Name, ID, Quantity, Price:");
                    inventory.addItemAtBeginning(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
                }
                case 2 -> {
                    System.out.println("Enter Name, ID, Quantity, Price:");
                    inventory.addItemAtEnd(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextDouble());
                }
                case 3 -> {
                    System.out.println("Enter Item ID to Remove:");
                    inventory.removeItem(scanner.nextInt());
                }
                case 4 -> {
                    System.out.println("Enter Item ID and New Quantity:");
                    inventory.updateQuantity(scanner.nextInt(), scanner.nextInt());
                }
                case 5 -> {
                    System.out.println("Enter Item ID to Search:");
                    inventory.searchItemById(scanner.nextInt());
                }
                case 6 -> {
                    System.out.println("Enter Item Name to Search:");
                    inventory.searchItemByName(scanner.next());
                }
                case 7 -> inventory.displayTotalValue();
            }
        }
        scanner.close();
    }
}
