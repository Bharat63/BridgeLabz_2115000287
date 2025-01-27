 
 import java.util.*;
 class CalculateSI{
	 public static void SimpleIntrest( double p, double r, double t){
		 double SI= (p*r*t)/100;
		 System.out.println("The simple intrest will be " +  SI);
	 }
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principle");
	double p=sc.nextDouble();
	System.out.println("Enter the Rate");
	double r=sc.nextDouble();
	System.out.println("Enter the time");
	double t=sc.nextDouble();
	SimpleIntrest(p,r,t);
	
	
	
}
}