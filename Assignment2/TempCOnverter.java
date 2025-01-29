import java.util.Scanner;

public class TempCOnverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Convert to (C/F)? ");
        char unit = scanner.next().charAt(0);
        scanner.close();

        if (unit == 'C' || unit == 'c')
            System.out.println("Converted: " + toCelsius(temp) + "°C");
        else if (unit == 'F' || unit == 'f')
            System.out.println("Converted: " + toFahrenheit(temp) + "°F");
        else
            System.out.println("Invalid input!");
    }

    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
