//Write a program to create a simple calculator using switch case and make it user-driven

import java.util.*;
public class calci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter operator");
        char operator=sc.next().charAt(0);
        sc.close();
        switch(operator){
            case '+' : System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            default :System.out.println("Enter a valid operator");
            
        }
    }
}