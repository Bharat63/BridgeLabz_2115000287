import java.util.Scanner;

public class SumOfNaturalNumberFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n >= 0) {
            // Compute the sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            // Compare the results
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);

            // Check if both results are the same
            if (sumFormula == sumFor) {
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
