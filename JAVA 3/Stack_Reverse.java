//Write a program to reverse a Stack
import java.util.Stack;

public class Stack_Reverse {

    public static class MyStack {
        public static void pushAtBottom(Stack<Integer> s, int data) {
            if (s.isEmpty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            pushAtBottom(s, data);
            s.push(top);
        }

        public static void reverseStack(Stack<Integer> s) {
            if (s.isEmpty()) {
                return;
            }
            int top = s.pop();
            reverseStack(s);
            pushAtBottom(s, top);
        }
    }

    public static void printStack(Stack<Integer> s) {
        Stack<Integer> tempStack = new Stack<>();
        while (!s.isEmpty()) {
            tempStack.push(s.pop());
        }
        while (!tempStack.isEmpty()) {
            int element = tempStack.pop();
            System.out.println(element);
            s.push(element); // Restore the original stack
        }
    }

    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Original Stack:");
        printStack(s);

        MyStack.reverseStack(s);

        System.out.println("Reversed Stack:");
        printStack(s);
    }
}
