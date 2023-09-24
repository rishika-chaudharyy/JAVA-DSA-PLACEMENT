//Write a program for type promotion in java

import java.util.*;
public class type_promotion {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        byte a=9;
        byte b=(byte)(a*2);
        System.out.println(b);
        byte x=90;
        short y=8;
        char z='a';
        int c= x*y*z;
        System.out.println(c);
        sc.close();
        
    }
    
}
