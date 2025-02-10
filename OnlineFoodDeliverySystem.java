import java.util.ArrayList;
import java.util.List;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity + 
                           ", Total: " + calculateTotalPrice());
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - applyDiscount();
    }

    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% discount on Veg Items";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 20;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity() + ADDITIONAL_CHARGE) - applyDiscount();
    }

    public double applyDiscount() {
        return getPrice() * getQuantity() * 0.02;
    }

    public String getDiscountDetails() {
        return "2% discount on Non-Veg Items + ₹20 additional charge";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 250, 2));
        order.add(new NonVegItem("Chicken Biryani", 350, 1));

        for (FoodItem item : order) {
            item.getItemDetails();
        }
    }
}
