import java.util.Scanner;

public class SumOfNaturalNumberWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            // Compute using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute using a while loop
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }

            // Compare the results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using while loop: " + sumWhile);

            if (sumFormula == sumWhile) {
                System.out.println("Both computations match and are correct.");
            } else {
                System.out.println("There is a mismatch in the results.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        scanner.close();
    }
}
