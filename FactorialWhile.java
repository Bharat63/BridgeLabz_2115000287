import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int factorial = 1;

        if (number >= 0) {
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        }

        scanner.close();
    }
}
