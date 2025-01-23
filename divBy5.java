import java.util.*;
public class divBy5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int number=sc.nextInt();
if(number % 5 ==0){
System.out.println("Is the number divisible by 5, YES");
}else{
System.out.println("Is the number divisible by 5, NO");
}
}
}
