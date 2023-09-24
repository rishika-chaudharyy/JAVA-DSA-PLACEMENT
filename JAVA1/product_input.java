//Write a program to find the product of two numbers by taking input from the user

import java.util.*;
public class product_input {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=a*b;
        System.out.print(product);
        sc.close();
    }
}