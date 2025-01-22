import java.util.Scanner;

public class powerCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the base ");
        double base=sc.nextDouble();
        System.out.println("Enter the exponent");
        double exponent=sc.nextDouble();
        double result=Math.pow(base,exponent);
        System.out.println(base + " raised to power " + exponent + " is " + result); 
    }
}