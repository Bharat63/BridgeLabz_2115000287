import java.util.*;
class Book2{
String title;
String author;
int price;
boolean isAvailable;	
Book2(String title,String author,int price, boolean isAvailable	){
	this.title=title;
	this.author=author;
	this.price=price;
	this.isAvailable=isAvailable;
}
void display(){
	System.out.println("Book Details:");
	System.out.println("Title: " +title);
	System.out.println("Author: " +author);
	System.out.println("Price " +price);
	System.out.println("Available: " + (isAvailable ? "Available" : "Not Available"));
}
void borrowBook(){
	if(isAvailable){
		System.out.println("You have successfully borrowed: " + title);
		isAvailable=false;
	}else{
		System.out.println("Sorry, this book is currently not available");
	}
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter book Title:");
	String title=sc.nextLine();
	System.out.println("Enter the Author");
	String author=sc.nextLine();
	System.out.println("Enter the price: ");
	int price=sc.nextInt();
	System.out.println("Enter the availability");
	Book2 b=new Book2(title, author,price,true);
	b.display();
	
	System.out.println("\n Do you want to borrow the book");
	sc.nextLine();
	String choice=sc.nextLine();
	if (choice.equalsIgnoreCase("yes")) {
            b.borrowBook();
        } else {
            System.out.println("You chose not to borrow the book.");
        }
	b.display();
}
}