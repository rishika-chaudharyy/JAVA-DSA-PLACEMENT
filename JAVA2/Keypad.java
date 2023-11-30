//Write a program for keypad combinations
import java.util.*;
public class Keypad {
    static String keypad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
    public static void possible(String s , String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        String key=keypad[s.charAt(0)-48];
        for(int i=0;i<key.length();i++){
            possible(s.substring(1),ans+key.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        possible(s," ");
        sc.close();

    }
}

    