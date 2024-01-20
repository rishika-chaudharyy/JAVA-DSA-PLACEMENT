//Write a program to find linked list is palindromic or not 

import java.util.Stack;

public class LL_Palindromic {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public boolean isPalindrome(Node head) {
        Stack<Node> stack = new Stack<>();

        for (Node curr = head; curr != null; curr = curr.next) {
            stack.push(curr);
        }

        Node left = head;
        Node right;

        while (stack.size() > 0) {
            right = stack.pop();

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
        }

        return true;
    }

    public static void main(String args[]) {
        LL_Palindromic ll = new LL_Palindromic();

        // Create a sample linked list
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(3);
        ll.head.next.next.next.next = new Node(2);
        ll.head.next.next.next.next.next = new Node(1);

        // Check if the linked list is a palindrome
        boolean isPalindrome = ll.isPalindrome(head);

        // Print the result
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
