import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();

        if (isPalindrome(str))
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s", "");
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
