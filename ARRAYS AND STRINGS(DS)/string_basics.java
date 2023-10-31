//Write a program to create a string and find its length and concatenate two strings
import java.util.*;
public class string_basics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstname=sc.nextLine();
        System.out.println("Enter your last name");
        String lastname=sc.nextLine();
        System.out.println(firstname.length());
        System.out.println(lastname.length());
        System.out.println("FULL NAME IS : "+firstname+" "+lastname);
        sc.close();
    }

}