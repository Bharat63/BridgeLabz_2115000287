import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double r=sc.nextDouble();
        double area= pi*r*r;
        System.out.println("The area of circle is " + area);
    }
}