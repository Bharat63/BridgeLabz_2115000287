class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }
}

class Order {
    String orderId;
    Product[] products;
    int productCount;

    Order(String orderId, int maxProducts) {
        this.orderId = orderId;
        this.products = new Product[maxProducts];
        this.productCount = 0;
    }

    void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount++] = product;
        } else {
            System.out.println("Cannot add more products to order " + orderId);
        }
    }

    void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (int i = 0; i < productCount; i++) {
            products[i].display();
        }
    }
}

class Customer {
    String name;
    Order[] orders;
    int orderCount;

    Customer(String name, int maxOrders) {
        this.name = name;
        this.orders = new Order[maxOrders];
        this.orderCount = 0;
    }

    void placeOrder(Order order) {
        if (orderCount < orders.length) {
            orders[orderCount++] = order;
            System.out.println(name + " placed Order ID: " + order.orderId);
        } else {
            System.out.println(name + " cannot place more orders.");
        }
    }

    void showOrders() {
        System.out.println(name + "'s Orders:");
        for (int i = 0; i < orderCount; i++) {
            orders[i].showOrderDetails();
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Smartphone", 800.00);
        Product p3 = new Product("Headphones", 150.00);

        Customer customer1 = new Customer("Alice", 2);
        Customer customer2 = new Customer("Bob", 2);

        Order order1 = new Order("ORD001", 3);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order("ORD002", 3);
        order2.addProduct(p3);

        customer1.placeOrder(order1);
        customer2.placeOrder(order2);

        System.out.println();
        customer1.showOrders();
        customer2.showOrders();
    }
}
