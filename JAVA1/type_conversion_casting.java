//Write a program for type casting and conversion

import java.util.*;
public class type_conversion_casting {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float number=sc.nextInt(); //possible due to compatibility
        System.out.println(number);//Implicit type conversion
        float b=25.12f; //Explicit type casting
        int a =(int)b;
        System.out.println(a);
        char ch='a'; //ASCII value
        int num=(int)ch;
        System.out.println(num);

        sc.close();
        
    }
    
}
