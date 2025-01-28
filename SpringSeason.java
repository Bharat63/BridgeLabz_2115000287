import java.util.*;

public class SpringSeason {

    public static boolean Spring(int m, int d) {
        if ((m == 3 && d >= 20 && d <= 31) ||
            (m == 4 && d >= 1 && d <= 30) ||
            (m == 5 && d >= 1 && d <= 31) ||
            (m == 6 && d >= 1 && d <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Month (1-12): ");
        int m = sc.nextInt();

        System.out.println("Enter the Day (1-31): ");
        int d = sc.nextInt();

        if (m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("You have entered an invalid date.");
        } else {
            if (Spring(m, d)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("It's not a Spring Season.");
            }
        }

        sc.close();
    }
}
