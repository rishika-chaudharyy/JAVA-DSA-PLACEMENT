//Write a program to print number 1-n

import java.util.*;
public class one_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int counter=1;
    while(counter<=n){
        System.out.println(counter);
        counter++;
    }
    System.out.println();
    sc.close();
    }
}
