//Write a program to check if a number is prime or not

import java.util.*;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("is prime");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                    break; // You can break out of the loop when you find a factor
                }
            }
            if (isprime==true) {
                System.out.println("is prime");
            } else {
                System.out.println("is not prime");
            }
            sc.close();
        }
    }
}
