import java.util.Scanner;

public class FactorCalculation {

    // Method to find factors and store them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // First loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;
        
        // Second loop to store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        
        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of the square of the factors
    public static double sumOfSquareOfFactors(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        
        int[] factors = findFactors(number);
        
        
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        
        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquareOfFactors(factors));
    }
}
