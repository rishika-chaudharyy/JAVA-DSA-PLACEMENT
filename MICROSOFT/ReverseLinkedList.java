import java.util.Stack;

public class ReverseLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static void reverse() {
        if (head == null || head.next == null) {
            System.out.println("List is empty or has only one element. Nothing to reverse.");
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node curr = head;

        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        curr = stack.pop();
        head = curr;

        while (!stack.isEmpty()) {
            curr.next = stack.pop();
            curr = curr.next;
        }

        curr.next = null;
    }

    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        head = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);

        head.next = two;
        two.next = three;

        System.out.println("Original Linked List:");
        printList();

        reverse();

        System.out.println("Reversed Linked List:");
        printList();
    }
}
