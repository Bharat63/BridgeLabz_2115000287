import java.util.*;
class book{
	String title;
	String auther;
	int price;
	
public book(String title, String auther, int price){
	this.title=title;
	this.auther=auther;
	this.price=price;
}

public void displayBook(){
	System.out.println("\n Book details: ");
	System.out.println("Title: " +title);
	System.out.println("Auther: " +auther);
	System.out.println("Price: " +price);
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Title of book");
	String title=sc.nextLine();
	System.out.println("Enter the Auther of the book");
	String auther=sc.nextLine();
	System.out.println("Enter the price of the book");
	int price=sc.nextInt();
	book b=new book(title,auther,price);
	b.displayBook();
}
}