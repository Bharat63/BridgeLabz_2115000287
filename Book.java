import java.util.*;
class Book{
	String title;
	String author;
	int price;
Book(){
	this.title="Think and grow Rich";
	this.author="Napolein Hill";
	this.price=599;
}

Book(String title, String author,int price){
	this.title=title;
	this.author=author;
	this.price=price;
	
}
public void display(){
	System.out.println("Book details :");
	System.out.println("Book title : " + title);
	System.out.println("Book Author: " + author);
	System.out.println("Book price : " +price);	
}
public static void main(String[] agrs){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the title of book");
	String title=sc.nextLine();
	System.out.println("Enter the Author");
	String author=sc.nextLine();
	System.out.println("Enter the price of Book");
	int price=sc.nextInt();
	Book b=new Book(title,author,price);
	b.display();
}
}