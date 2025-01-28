import java.util.Scanner;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians
        double sine = Math.sin(radians);  // Sine of the angle
        double cosine = Math.cos(radians); // Cosine of the angle
        double tangent = Math.tan(radians); // Tangent of the angle

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine of " + angle + "°: " + results[0]);
        System.out.println("Cosine of " + angle + "°: " + results[1]);
        System.out.println("Tangent of " + angle + "°: " + results[2]);

        scanner.close();
    }
}
