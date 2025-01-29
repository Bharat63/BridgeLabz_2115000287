import java.util.Scanner;

public class GCDLCMCalcutator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt();
        scanner.close();

        System.out.println("GCD: " + findGCD(a, b));
        System.out.println("LCM: " + findLCM(a, b));
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
