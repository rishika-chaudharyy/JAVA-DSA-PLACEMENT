//Write a program to decode a string
import java.util.Stack;

class Solution {
    static String decode(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> stringStack = new Stack<>();
        String temp = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;  // Move back one step as the loop increments i
                integerStack.push(count);
            } else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                if (!integerStack.isEmpty()) {
                    count = integerStack.peek();
                    integerStack.pop();
                }

                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp = stringStack.peek() + temp;
                    stringStack.pop();
                }

                if (!stringStack.isEmpty() && stringStack.peek() == '[') {
                    stringStack.pop(); // Remove '['
                }

                for (int j = 0; j < count; j++) {
                    result = result + temp;
                }

                for (int j = 0; j < result.length(); j++) {
                    stringStack.push(result.charAt(j));
                }

                result = "";
            } else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1))) {
                    stringStack.push(str.charAt(i));
                } else {
                    stringStack.push(str.charAt(i));
                    integerStack.push(1);
                }
            } else {
                stringStack.push(str.charAt(i));
            }
        }

        while (!stringStack.isEmpty()) {
            result = stringStack.peek() + result;
            stringStack.pop();
        }

        return result;
    }

    public static void main(String args[]) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str));
    }
}
