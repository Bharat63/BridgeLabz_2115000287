import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[] height = new double[numPersons];
        double[] weight = new double[numPersons];
        double[] bmi = new double[numPersons];
        String[] status = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            height[i] = sc.nextDouble() / 100; // Convert to meters
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = sc.nextDouble();
        }

        for (int i = 0; i < numPersons; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n", height[i] * 100, weight[i], bmi[i], status[i]);
        }

        sc.close();
    }
}
