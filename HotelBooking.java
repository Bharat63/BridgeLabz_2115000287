import java.util.*;
class HotelBooking{
	String guestName;
	String roomType;
	int night;
	
HotelBooking(){
	this.guestName="guest";
	this.roomType="AC";
	this.night=2;
}
HotelBooking(String guestName, String roomType,int night){
	this.guestName=guestName;
	this.roomType=roomType;
	this.night=night;
}
HotelBooking(HotelBooking other){
	this.guestName=other.guestName;
	this.roomType=other.roomType;
	this.night=other.night;
}
void display(){
	System.out.println("Guest Name: " + guestName);
	System.out.println("RoomType: " + roomType);
	System.out.println("Nights: " + night);
}
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Guest name :");
	String guestName=sc.nextLine();
	System.out.println("Enter Room type :");
	String roomType=sc.nextLine();
	System.out.println("Enter no. of nights :");
	int night=sc.nextInt();
	
	HotelBooking booking1=new HotelBooking(guestName,roomType,night);
	System.out.println("Orignal booking details");
	booking1.display();
	
	HotelBooking booking2=new HotelBooking(booking1);
	System.out.println("Cloned booking details");
	booking2.display();
	
	
}

}