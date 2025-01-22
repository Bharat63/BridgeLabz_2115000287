import java.util.Scanner;

public class add2Number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=sc.nextInt();
        System.out.println("Enter second number");
        int number2=sc.nextInt();
        int sum= number1 + number2;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}