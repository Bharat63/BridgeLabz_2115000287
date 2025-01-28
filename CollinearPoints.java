import java.util.Scanner;

public class CollinearPoints {

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes of AB, BC, and AC
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Points are collinear if all slopes are equal
        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    // Method to check if three points are collinear using the area of triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate the area of the triangle formed by the three points
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if the area is 0
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for 3 points
        System.out.println("Enter the coordinates of point A (x1, y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the coordinates of point B (x2, y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter the coordinates of point C (x3, y3):");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Check if the points are collinear using slope formula
        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the slope formula.");
        } else {
            System.out.println("The points are not collinear using the slope formula.");
        }

        // Check if the points are collinear using area of triangle formula
        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear using the area of triangle formula.");
        } else {
            System.out.println("The points are not collinear using the area of triangle formula.");
        }

        // Sample points A(2, 4), B(4, 6), C(6, 8)
        System.out.println("\nFor the sample points A(2, 4), B(4, 6), C(6, 8):");
        if (areCollinearBySlope(2, 4, 4, 6, 6, 8)) {
            System.out.println("The sample points are collinear using the slope formula.");
        } else {
            System.out.println("The sample points are not collinear using the slope formula.");
        }

        if (areCollinearByArea(2, 4, 4, 6, 6, 8)) {
            System.out.println("The sample points are collinear using the area of triangle formula.");
        } else {
            System.out.println("The sample points are not collinear using the area of triangle formula.");
        }

        scanner.close();
    }
}
