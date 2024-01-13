//Write a program to find the intersection point of two lined list
public class LL_Intersection {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static Node head;

        static Node intersection(Node l1, Node l2) {
            if (l1 == null || l2 == null) {
                return null;
            }
            Node p1 = l1;
            Node p2 = l2;

            while (p1 != p2) {
                p1 = (p1 == null) ? l2 : p1.next;
                p2 = (p2 == null) ? l1 : p2.next;
            }
            return p1;
        }
    }

    public static void main(String args[]) {
        // Create linked lists
        Node head1 = new Node(1);
        Node second1 = new Node(2);
        Node third1 = new Node(3);
        Node fourth1 = new Node(4);
        head1.next = second1;
        second1.next = third1;
        third1.next = fourth1;

        Node head2 = new Node(5);
        Node second2 = new Node(3);
        Node third2 = new Node(4);
        head2.next = second2;
        second2.next = third2;
        third2.next = third1;  // Connecting the third node of list2 to the third node of list1

        // Find intersection point
        Node result = Node.intersection(head1, head2);

        // Print the intersection point's data
        if (result != null) {
            System.out.println("Intersection point data: " + result.data);
        } else {
            System.out.println("No intersection point found.");
        }
    }
}
