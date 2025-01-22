import java.util.Scanner;

public class volumeOfCylinder {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        double r=sc.nextDouble();
        System.out.println("Enter the height of cylinder");
        double h=sc.nextDouble();
        double area= pi*r*r*h;
        System.out.println("The area of cylinder is " + area);
    }
}