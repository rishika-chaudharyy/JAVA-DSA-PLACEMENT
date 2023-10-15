//Write a program to input a,b,c and find their average

import java.util.*;
public class average_three {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        sc.close();
        int average=(a+b+c)/3;
        System.out.print("Average is:"+average);
        
    }
}