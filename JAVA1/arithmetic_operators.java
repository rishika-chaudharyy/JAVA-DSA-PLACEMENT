//Write a program to perform various arithmetic operations both using unary and binary operators

import java.util.*;
public class arithmetic_operators{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum is :" +a+b);
        System.out.println("Difference is :" +(a-b));
        System.out.println("Product is :" +a*b);
        System.out.println("Quotient is :" +a/b);
        System.out.println("Remainder is :" +a%b);
        a++;
        b--;
        --b;
        ++a;
        --a;
        a--;
        b++;
        ++b;
        System.out.println(b);
        System.out.println(a);
        sc.close();

    }
}