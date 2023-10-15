//Write a program to calculate income tax

import java.util.*;
public class income_tax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income");
        int income=sc.nextInt();
        sc.close();
        int tax;
        if(income<=500000){
            tax=0;
        }
        else if(income>500000 && income<1000000){
            tax=(int)(0.2*income);
        }else{
            tax=(int)(0.3*income);
        }
        System.out.println("The tax is :"+tax);

    }

}