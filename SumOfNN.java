import java.util.Scanner;

public class SumOfNN{

    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the value of n
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if the input is a valid natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        // Calculate the sum using recursion
        int sumRec = sumRecursive(n);

        // Calculate the sum using the formula
        int sumFor = sumFormula(n);

        // Display the results
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula n*(n+1)/2: " + sumFor);

        // Compare the results
        if (sumRec == sumFor) {
            System.out.println("Both methods give the correct and same result.");
        } else {
            System.out.println("The results don't match, which is unexpected.");
        }
    }
}
