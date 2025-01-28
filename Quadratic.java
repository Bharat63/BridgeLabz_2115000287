public class Quadratic {

    public static double[] findQuadraticRoots(double a, double b, double c) {
        double[] roots = new double[2];
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            roots[0] = (-b + Math.sqrt(delta)) / (2 * a); // First root
            roots[1] = (-b - Math.sqrt(delta)) / (2 * a); // Second root
            return roots;
        } else if (delta == 0) {
            roots[0] = -b / (2 * a); // One root
            return new double[]{roots[0]};
        } else {
            return new double[0]; // No real roots
        }
    }

    public static void main(String[] args) {
        // Quadratic Roots Calculation
        double a = 1, b = -3, c = 2; // Example coefficients
        double[] roots = findQuadraticRoots(a, b, c);
        if (roots.length == 0) {
            System.out.println("No real roots");
        } else {
            System.out.print("Roots: ");
            for (double root : roots) {
                System.out.print(root + " ");
            }
            System.out.println();
        }
    }
}
