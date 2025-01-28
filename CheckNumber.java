import java.util.*;
public class CheckNumber{
	public static int Number(int n){
		if(n>0){
			return 1;
		}else if(n<0){
			return -1;
		}else{
			return 0;
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=sc.nextInt();
		System.out.println(Number(n));
	}
}