//Write a program to check even and odd using ternary operator


import java.util.*;

public class ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println("The number " + number + " is " + result + ".");
    }
}
