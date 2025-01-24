import java.util.Scanner;

public class ZaraBonusCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberOfEmployees = 10;
        double[] salary = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];
        double[] bonus = new double[numberOfEmployees];
        double[] newSalary = new double[numberOfEmployees];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < numberOfEmployees; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                salary[i] = sc.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                yearsOfService[i] = sc.nextDouble();
                if (salary[i] <= 0 || yearsOfService[i] < 0) {
                    System.out.println("Invalid input. Please enter positive salary and valid years of service.");
                } else {
                    validInput = true;
                }
            }
        }

        for (int i = 0; i < numberOfEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee Bonus and Salary Details:");
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary = " + salary[i]);
            System.out.println("Bonus = " + bonus[i]);
            System.out.println("New Salary = " + newSalary[i]);
            System.out.println();
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
