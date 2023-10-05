//Write a program to get input and print whether positive or negative

import java.util.*;
public class positive_negative {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    String answer=(num>=0)?"positive or zero":"negative";
    System.out.println(answer);
    sc.close();
    }
    
}
