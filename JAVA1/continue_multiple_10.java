//Write a program to display all numbers entered by user except multiple of 10

import java.util.Scanner;

public class continue_multiple_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        
        do {
            System.out.print("Enter a number (or enter 0 to exit): ");
            num = scanner.nextInt();
            
            if (num == 0) {
                break; // Exit the loop if the user enters 0
            }
            
            if (num % 10 == 0) {
                continue; // Skip multiples of 10
            }
            
            System.out.println("You entered: " + num);
        } while (true);
        
        scanner.close();
    }
}
