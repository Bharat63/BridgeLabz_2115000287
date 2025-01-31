import java.util.*;
class Circle{
	double radius;

public Circle(double radius){
	this.radius=radius;
}
public double calculateArea(){
	return Math.PI * radius * radius;
}
public double calculatePerimeter(){
	return 2 * Math.PI * radius;
}
public  void display(){
	System.out.println("\n Circle Details");
	System.out.println("Radius: " + radius);
	System.out.println("Area "+ calculateArea());
	System.out.println("Circumference " + calculatePerimeter());
}

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter radius of Circle");
	double radius=sc.nextDouble();
	Circle c= new Circle(radius);
	c.display();	
}
}