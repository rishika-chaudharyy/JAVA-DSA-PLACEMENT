//Write a program to check if in a valid string a duplicate paranthesis exists or not
import java.util.*;

public class Stack_DuplicateParanthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop(); // Pop the open parenthesis
                }
            } else {
                s.push(ch);
            }
        }
        return false; // No duplicate parentheses found
    }

    public static void main(String args[]) {
        String str = "((a+b))";
        String str2 = "(a+b)";

        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));
    }
}
