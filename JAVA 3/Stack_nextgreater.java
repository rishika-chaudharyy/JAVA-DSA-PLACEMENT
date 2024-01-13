//Write a program to find the array of the next greater element
import java.util.Stack;

public class Stack_nextgreater {
    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);  // Push the index i, not the value 1
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
//next greater left side then reverse the for loop
//next smallest right size then change the while loop condition
//mext smallest left side then do both simulataeneously 