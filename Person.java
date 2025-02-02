import java.util.*;
class Person{
	String name;
	int age;

Person(String name, int age){
	this.name=name;
	this.age=age;
}
Person(Person other){
	this.name=other.name;
	this.age=other.age;
}
void details(){
	System.out.println("Name "+ name);
	System.out.println("Age " +age);
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	String name=sc.nextLine();
	System.out.println("Enter the age");
	int age=sc.nextInt();
	
	Person p1=new Person( name,  age);
	System.out.println("\n Orignal Person details");
	p1.details();
	
	Person p2=new Person(p1);
	System.out.println("\n Cloned Person details");
	p2.details();
	
	
}
}