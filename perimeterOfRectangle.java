import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int l=sc.nextInt();
        System.out.println("Enter the width");
        int w=sc.nextInt();
        int perimeter= 2*(l+w);
        System.out.println("The perimeter of rectangle is " + perimeter);
        

    }
}