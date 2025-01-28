import java.util.Random;

public class EmployeeBonus {

    // Method to determine salary and years of service for each employee
    public static int[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        int[][] employeeData = new int[numEmployees][2]; // 2D array to store salary and years of service

        for (int i = 0; i < numEmployees; i++) {
            // Generate random 5-digit salary
            employeeData[i][0] = 10000 + rand.nextInt(90000); // Random salary between 10,000 and 99,999

            // Generate random years of service between 1 and 20
            employeeData[i][1] = 1 + rand.nextInt(20); // Random years of service between 1 and 20
        }

        return employeeData;
    }

    // Method to calculate the new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] resultData = new double[employeeData.length][3]; // Array to store new salary and bonus

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus;

            // Determine the bonus based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus for more than 5 years of service
            } else {
                bonus = oldSalary * 0.02; // 2% bonus for less than 5 years of service
            }

            // Calculate the new salary
            double newSalary = oldSalary + bonus;

            // Store the result in the array: new salary, bonus, and old salary
            resultData[i][0] = newSalary;
            resultData[i][1] = bonus;
            resultData[i][2] = oldSalary;
        }

        return resultData;
    }

    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplaySalaries(double[][] resultData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        // Loop through the resultData to calculate totals
        for (int i = 0; i < resultData.length; i++) {
            totalOldSalary += resultData[i][2];
            totalNewSalary += resultData[i][0];
            totalBonus += resultData[i][1];
        }

        // Display the results in a tabular format
        System.out.printf("%-10s %-15s %-15s %-15s %-15s\n", "Employee", "Old Salary", "Bonus", "New Salary", "Years of Service");
        for (int i = 0; i < resultData.length; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f %-15d\n", i + 1, resultData[i][2], resultData[i][1], resultData[i][0], (int) resultData[i][2]);
        }

        // Display the total bonus and salary
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10; // Number of employees
        int[][] employeeData = generateEmployeeData(numEmployees); // Generate data for employees
        double[][] resultData = calculateBonusAndNewSalary(employeeData); // Calculate new salary and bonus
        calculateAndDisplaySalaries(resultData); // Display the results
    }
}
