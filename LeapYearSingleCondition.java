import java.util.Scanner;

public class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();

        // Ensure the year is within the valid range
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            // Using a single if condition with logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        scanner.close();
    }
}
