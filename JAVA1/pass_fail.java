//Write a program to check pass or fail using ternary operator

import java.util.*;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        sc.close();

        String result = (marks>=33) ? "pass" : "fail";

        System.out.println("The result is " + result + ".");
    }
}
