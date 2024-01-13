//Write a program to reverse a string using stack
import java.util.*;

public class Stack_ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            stack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static void main(String args[]) {
        String str = "Abc";
        System.out.println(reverse(str));
    }
}
