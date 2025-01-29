import java.util.*;
public class VowelAndConstCounter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String Str=sc.nextLine();
        CountVowelAndConstCounter(Str);
    }
    public static void CountVowelAndConstCounter(String str){
        int vowel=0,consonents=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' &&ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowel++;
            else
                consonents++;
            }
        }
        System.err.println("Vowel " + vowel);
        System.err.println("Consonents " + consonents);
    }
}