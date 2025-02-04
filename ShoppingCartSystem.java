import java.util.Scanner;

class Product {
    static double discount = 10.0;
    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    double calculateTotalPrice() {
        return price * quantity * (1 - discount / 100);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        Product product = new Product(productID, productName, price, quantity);
        product.displayProductDetails();
        System.out.println("Total Price after Discount: $" + product.calculateTotalPrice());
        scanner.close();
    }
}
