import java.util.Random;

public class RandomStats {

    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + rand.nextInt(9000); // Generates a random 4-digit number
        }
        return randomNumbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        // Random Number Generation and Average, Min, Max Calculation
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + stats[1]);
        System.out.println("Max: " + stats[2]);
    }
}
