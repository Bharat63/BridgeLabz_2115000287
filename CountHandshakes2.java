import java.util.*;



public class CountHandshakes2{
	
	public static void handshakes(int n){
		int result= (n * (n - 1)) / 2;
		System.out.println(result);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		if(n<2){
			System.out.println("Student should be more than 2");
		}else{
			handshakes(n);
		}
	}
}

