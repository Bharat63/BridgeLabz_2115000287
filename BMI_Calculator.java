import java.util.Scanner;

public class BMI_Calculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] statuses = new String[10];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // 10 members, 3 columns (weight, height, BMI)
        
        // Take input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for member " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = scanner.nextDouble();
        }
        
        // Calculate BMI for each person
        calculateBMI(teamData);
        
        // Get the BMI statuses
        String[] statuses = getBMIStatus(teamData);
        
        // Display the results
        System.out.println("\nTeam BMI Details:");
        System.out.println("Member | Weight (kg) | Height (cm) | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-7d | %-12.2f | %-12.2f | %-5.2f | %-15s\n", 
                i + 1, teamData[i][0], teamData[i][1], teamData[i][2], statuses[i]);
        }

        scanner.close();
    }
}
