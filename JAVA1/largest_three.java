//Write a program to print the largest of three numbers

import java.util.*;
public class largest_three {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
         sc.close();
        if(a>b && a>c){
            System.out.println("a is greatest of the three");
        }
        else if(b>a && b>c){
            System.out.println("b is greatest of the three");
        }
        else{
            System.out.println("c is the greatest of the three");
        }
       
    }
}