import java.util.Scanner;

class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Owner Name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String vehicleType = scanner.nextLine();
        System.out.print("Enter Registration Number: ");
        String registrationNumber = scanner.nextLine();
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);
        vehicle.displayVehicleDetails();
        scanner.close();
    }
}
