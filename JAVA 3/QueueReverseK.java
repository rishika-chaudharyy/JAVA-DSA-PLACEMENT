//Write a program to reverse first k elements
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReverseK {

    static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (k <= 0 || k > queue.size()) {
            System.out.println("Invalid value of k");
            return;
        }

        Stack<Integer> stack = new Stack<>();

        // Push the first k elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Pop elements from the stack and enqueue them back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Enqueue the remaining elements in the same order
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int k = 5;

        // Adding elements to the queue
        for (int i = 10; i <= 100; i += 10) {
            queue.add(i);
        }

        System.out.println("Original Queue: " + queue);

        // Reverse the first k elements
        reverseFirstKElements(queue, k);

        System.out.println("Reversed Queue: " + queue);
    }
}
