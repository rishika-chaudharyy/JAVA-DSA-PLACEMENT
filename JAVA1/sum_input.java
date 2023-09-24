//Write a program to find sum of two numbers taking input from the user

import java.util.*;
public class sum_input {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        sc.close();
    }
}