//Write a program for user to keep entering numbers till user enters multiple of 10

import java.util.*;
public class break_multiple_10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number");
            int n=sc.nextInt();
            
            if(n%10==0){
                break;
            }
        }while(true);
        sc.close();
    }
    
}
