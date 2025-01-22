import java.util.Scanner;

public class calculateSimpleIntrest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal");
        double p=sc.nextDouble();
        System.out.println("Enter the Rate");
        double r=sc.nextDouble();
        System.out.println("Enter the time");
        double t=sc.nextDouble();
        double SI= (p*r*t)/100;
        System.out.println("The Simple intrest is " +SI);
    }
}