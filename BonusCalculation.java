import java.util.Scanner;

public class BonusCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your bonus amount is " + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }

        scanner.close();
    }
}
