import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }

        scanner.close();
    }
}
