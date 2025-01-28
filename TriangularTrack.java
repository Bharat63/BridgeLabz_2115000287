import java.util.*;
public class TriangularTrack{
	public static int CalculateTrack(int s1,int s2, int s3){
		int perimeter=s1+s2+s3;
		int round= 5000/perimeter;
		return round;
	}
	
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter side 1");
	int s1=sc.nextInt();
	System.out.println("Enter side 2");
	int s2=sc.nextInt();
	System.out.println("Enter side 3");
	int s3=sc.nextInt();
	System.out.println(CalculateTrack(s1,s2,s3));
	}
}