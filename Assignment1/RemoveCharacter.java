import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        String modifiedString = removeCharacter(str, ch);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String removeCharacter(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
