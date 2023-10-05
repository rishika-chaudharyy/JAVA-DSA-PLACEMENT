//Write a program to print largest of two number.

import java.util.*;
public class largest_two {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println("a is greatest of the two");
        }
        else{
            System.out.println("b is greatest of the two");
        }
        
    }
}