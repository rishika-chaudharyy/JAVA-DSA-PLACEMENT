//Write a program to print sum of first n natural numbers

import java.util.*;
public class sum_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        sc.close();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("Sum is "+sum);
    }
}
