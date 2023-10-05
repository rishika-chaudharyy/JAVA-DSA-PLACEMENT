//Write a program to print sum of even and odd numbers

import java.util.*;

public class sum_even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int even = 0;
        int odd = 0;
        do {
            System.out.println("Enter the number:");
            number = sc.nextInt();
            
            if (number % 2 == 0) {
                even = even + number;
            } else {
                odd = odd + number;
            }
            
            System.out.println("Do you want to continue? Press 1 for yes and any other number for no:");
            choice = sc.nextInt();
        } while (choice == 1);
        
        System.out.println("Sum of even numbers is: " + even);
        System.out.println("Sum of odd numbers is: " + odd);
        
        sc.close();
    }
}
