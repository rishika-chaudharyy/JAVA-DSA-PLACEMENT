//Write a program to check if the number is odd or even

import java.util.*;
public class even_odd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
           sc.close();
        if(number%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
     
    }
}
