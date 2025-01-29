import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = scanner.nextDouble(), num2 = scanner.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        scanner.close();

        double result = performOperation(num1, num2, op);
        System.out.println("Result: " + result);
    }

    public static double performOperation(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return b != 0 ? a / b : Double.NaN;
            default: return Double.NaN;
        }
    }
}
