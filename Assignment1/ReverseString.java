import java.util.*;


public class ReverseString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        System.out.println("The reversed String will be "+StringReverse(str));


    }
    public static String StringReverse(String str){
    String result="";
    for(int i=str.length()-1;i>=0;i--){
        result=result + str.charAt(i);
    }
    return result;
    }
}