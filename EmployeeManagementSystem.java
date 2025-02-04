import java.util.Scanner;

class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;
    final int id;
    String name;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Enter Designation: ");
        String designation = scanner.nextLine();
        Employee employee = new Employee(name, id, designation);
        employee.displayEmployeeDetails();
        Employee.displayTotalEmployees();
        scanner.close();
    }
}
