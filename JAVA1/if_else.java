//Write a program to input age and check if adult or teenager or child.

import java.util.*;
public class if_else {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age");
    int age=sc.nextInt();
    sc.close();
    if(age<=13) {
        System.out.println("Child");
    }
    else if(age>13 && age<=17 ){
        System.out.println("Teenager");
    }
    else {
        System.out.println("Adult");
    }
    
}


}