import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        if (this instanceof Taxable) {
            return price + ((Taxable) this).calculateTax() - calculateDiscount();
        }
        return price - calculateDiscount();
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price + 
                           ", Discount: " + calculateDiscount() + 
                           (this instanceof Taxable ? ", Tax: " + ((Taxable) this).calculateTax() : "") + 
                           ", Final Price: " + getFinalPrice());
    }
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.15;
    }

    public String getTaxDetails() {
        return "15% GST on Electronics";
    }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }

    public double calculateTax() {
        return getPrice() * 0.08;
    }

    public String getTaxDetails() {
        return "8% GST on Clothing";
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.02;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 70000));
        products.add(new Clothing(2, "T-Shirt", 1500));
        products.add(new Groceries(3, "Rice Bag", 2000));

        for (Product product : products) {
            product.displayDetails();
        }
    }
}
