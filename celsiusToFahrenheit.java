import java.util.Scanner;

public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double celcius=sc.nextDouble();
        double fahrenheit=(celcius*9/5)+32;
        System.out.println("The temperature in fahrenheit is " + fahrenheit );
    }
}