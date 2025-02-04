import java.util.Scanner;

class Patient {
    static String hospitalName = "ABC Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment) {
        this.patientID = ++totalPatients;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    static int getTotalPatients() {
        return totalPatients;
    }

    void displayDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter patient 1 name: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter patient 1 age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter patient 1 ailment: ");
        String ailment1 = scanner.nextLine();
        Patient p1 = new Patient(name1, age1, ailment1);

        System.out.print("Enter patient 2 name: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter patient 2 age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        System.out.print("Enter patient 2 ailment: ");
        String ailment2 = scanner.nextLine();
        Patient p2 = new Patient(name2, age2, ailment2);

        if (p1 instanceof Patient) {
            p1.displayDetails();
        }

        if (p2 instanceof Patient) {
            p2.displayDetails();
        }

        System.out.println("Total Patients: " + Patient.getTotalPatients());
    }
}
