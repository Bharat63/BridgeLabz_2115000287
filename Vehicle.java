import java.util.Scanner;

class Vehicle {
    String ownerName, vehicleType;
    static double registrationFee = 5000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("\nOwner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String owner1 = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type1 = sc.nextLine();

        System.out.print("Enter Owner Name: ");
        String owner2 = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String type2 = sc.nextLine();

        Vehicle v1 = new Vehicle(owner1, type1);
        Vehicle v2 = new Vehicle(owner2, type2);

        System.out.print("\nEnter new Registration Fee: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        sc.close();
    }
}
