import java.util.Scanner;

public class FriendDetails {

    public static int findYoungest(int[] ages) {
        int youngestAge = ages[0];
        for (int age : ages) {
            if (age < youngestAge) {
                youngestAge = age;
            }
        }
        return youngestAge;
    }

    public static int findTallest(int[] heights) {
        int tallestHeight = heights[0];
        for (int height : heights) {
            if (height > tallestHeight) {
                tallestHeight = height;
            }
        }
        return tallestHeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] ages = new int[3];
        int[] heights = new int[3];
        
        // Input for ages
        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt();
        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt();
        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt();
        
        // Input for heights
        System.out.print("Enter height of Amar (in cm): ");
        heights[0] = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        heights[1] = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        heights[2] = scanner.nextInt();
        
        // Find and display youngest
        int youngestAge = findYoungest(ages);
        System.out.println("The youngest friend is " + youngestAge + " years old.");
        
        // Find and display tallest
        int tallestHeight = findTallest(heights);
        System.out.println("The tallest friend is " + tallestHeight + " cm tall.");

        scanner.close();
    }
}
