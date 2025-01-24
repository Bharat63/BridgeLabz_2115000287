import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = sc.nextInt();

        double[][] personData = new double[numPersons][3]; // [height, weight, BMI]
        String[] weightStatus = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Invalid input. Enter a positive height (in cm): ");
                height = sc.nextDouble();
            }
            personData[i][0] = height / 100; // Convert to meters

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Invalid input. Enter a positive weight (in kg): ");
                weight = sc.nextDouble();
            }
            personData[i][1] = weight;
        }

        for (int i = 0; i < numPersons; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s%n",
                personData[i][0] * 100, personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
