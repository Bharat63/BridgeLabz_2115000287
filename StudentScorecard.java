import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 columns for Physics, Chemistry, and Math

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(100);  // Physics score (0-99)
            scores[i][1] = random.nextInt(100);  // Chemistry score (0-99)
            scores[i][2] = random.nextInt(100);  // Math score (0-99)
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][4]; // 4 columns for Total, Average, Percentage, and rounded percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0;  // Rounded percentage to 2 decimal places
        }

        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Scorecard of Students:");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");  // Student number
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(Math.round(results[i][1] * 100.0) / 100.0 + "\t");
            System.out.println(results[i][3] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random scores for Physics, Chemistry, and Math for each student
        int[][] scores = generateScores(numStudents);

        // Calculate the total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        scanner.close();
    }
}
