import java.util.*;
class Employee{
	String name;
	int id;
	int salary;
	
	public Employee(String name, int id, int salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	


public void DisplayDetails(){
	System.out.println("Employee Details:");
	System.out.println("Name: " + name);
	System.out.println("id: " + id);
	System.out.println("Salary: $" + salary);
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Employee Name");
	String name=sc.nextLine();
	System.out.println("Employee id");
	int id=sc.nextInt();
	System.out.println("Employee Salary");
	int salary=sc.nextInt();
	Employee emp=new Employee(name, id ,salary);
	emp.DisplayDetails();
}
}