import java.util.Scanner;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("\nProduct Name: " + productName);
        System.out.println("Price: $" + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Price: ");
        double price2 = sc.nextDouble();

        Product p1 = new Product(name1, price1);
        Product p2 = new Product(name2, price2);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        sc.close();
    }
}
