import java.util.Scanner;

public class SubStringOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String subStr = scanner.nextLine();
        scanner.close();

        int count = countSubstringOccurrences(str, subStr);
        System.out.println("Occurrences of \"" + subStr + "\": " + count);
    }

    public static int countSubstringOccurrences(String str, String subStr) {
        int count = 0, index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward
        }
        return count;
    }
}
