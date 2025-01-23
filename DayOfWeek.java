import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int m, d, y;

        if (args.length == 3) {
            m = Integer.parseInt(args[0]);
            d = Integer.parseInt(args[1]);
            y = Integer.parseInt(args[2]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter month (1-12): ");
            m = scanner.nextInt();
            System.out.print("Enter day (1-31): ");
            d = scanner.nextInt();
            System.out.print("Enter year: ");
            y = scanner.nextInt();
            scanner.close();
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("The day of the week is: " + d0);
    }
}
