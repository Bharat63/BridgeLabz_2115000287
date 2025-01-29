import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int a = 0, b = 1, sum;
        System.out.print("Fibonacci Sequence: " + a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}
