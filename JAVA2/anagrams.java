//Write a program to check if two strings are anagrams or not
import java.util.Arrays;
public class anagrams {
    public static void main(String args[]){
        String str1="race";
        String str2="care";
        if(str1.length()==str2.length()){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result=Arrays.equals(arr1,arr2);
        if(result){
            System.out.println("These are anagrams");
        }else{
            System.out.println("These are not anagrams");
        }
        }else{
            System.out.println("These are not anagrams");
        }

    }
}
