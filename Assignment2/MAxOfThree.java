import java.util.Scanner;

public class MAxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        scanner.close();

        int max = findMax(a, b, c);
        System.out.println("Maximum number is: " + max);
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
