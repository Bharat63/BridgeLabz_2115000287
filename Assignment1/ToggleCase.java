import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        String toggledString = toggleCase(str);
        System.out.println("Toggled String: " + toggledString);
    }

    public static String toggleCase(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else
                result += ch; // Keep non-alphabet characters unchanged
        }
        return result;
    }
}
