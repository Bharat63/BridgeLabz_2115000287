import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String response;

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it.");

        while (true) {
            guess = generateGuess(low, high, random);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            response = scanner.next();

            if (response.equals("correct")) {
                System.out.println("Yay! The computer guessed your number.");
                break;
            } else if (response.equals("high")) {
                high = guess - 1;
            } else if (response.equals("low")) {
                low = guess + 1;
            }
        }
        scanner.close();
    }

    public static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }
}
