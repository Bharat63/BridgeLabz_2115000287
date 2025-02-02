import java.util.*;
class Circle{
	int radius;
	
Circle(){
	this.radius=2;
}
	
Circle(int radius){
	this.radius=radius;
}
void display(){
	System.out.println("Circle radius: " +radius);
}	
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Circle defaultCircle=new Circle();
	System.out.println("\nDefault circle");
	defaultCircle.display();
	
	System.out.println("Enter the radius of Circle");
	int radius=sc.nextInt();
	Circle c=new Circle(radius);
	c.display();
	
	
	
	
}
}