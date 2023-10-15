//Write a program to get input of different datatypes

import java.util.*;
public class input {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next(); //for one word
        System.out.println(input);
        String name=sc.nextLine(); //for multiple words
        System.out.println(name);
        int number=sc.nextInt(); //for numbers
        System.out.println(number);
        byte a=sc.nextByte();
        System.out.println(a);
        long b=sc.nextLong();
        System.out.println(b);
        float c=sc.nextFloat();
        System.out.println(c);
        double d=sc.nextDouble();
        System.out.println(d);
        boolean e=sc.nextBoolean();
        System.out.println(e);
        short f=sc.nextShort();
        System.out.println(f);
        sc.close();
    }
}