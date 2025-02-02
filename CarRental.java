import java.util.Scanner;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double rentalRate; // Cost per day
    double totalCost;

    // Default constructor
    CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Not Specified";
        this.rentalDays = 0;
        this.rentalRate = 1000.0; // Default rental rate per day
        this.totalCost = 0.0;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays, double rentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
        this.totalCost = calculateTotalCost();
    }

    // Copy Constructor
    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.rentalRate = other.rentalRate;
        this.totalCost = other.totalCost;
    }

    // Method to calculate total rental cost
    double calculateTotalCost() {
        return rentalDays * rentalRate;
    }

    // Display rental details
    void displayRentalDetails() {
        System.out.println("\nCar Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Rate per Day: $" + rentalRate);
        System.out.println("Total Cost: $" + totalCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for rental details
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter Car Model: ");
        String carModel = sc.nextLine();
        System.out.print("Enter Rental Days: ");
        int rentalDays = sc.nextInt();
        System.out.print("Enter Rental Rate per Day: ");
        double rentalRate = sc.nextDouble();

        // Creating an object with user input
        CarRental rental1 = new CarRental(customerName, carModel, rentalDays, rentalRate);
        
        // Display rental details
        rental1.displayRentalDetails();

        // Copy constructor usage (optional)
        CarRental rental2 = new CarRental(rental1);
        System.out.println("\nCopying Rental Details...");
        rental2.displayRentalDetails();

        sc.close();
    }
}
