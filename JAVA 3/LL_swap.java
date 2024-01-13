// Swapping Nodes in a Linked List

// We have a linked list and two keys in it. We need to swap nodes for the two given keys. Nodes should be swapped by changing their links. Swapping data of nodes may be expensive in many situations when data contains many fields. It can be assumed that all keys in the linked list are distinct.

// Sample Input 1:
// 1 -> 2 -> 3 -> 4, x = 2, y = 4

// Sample Output 1:
// 1 -> 4 -> 3 -> 2



class LL_swap {
    class Node {
    int data;
    Node next;
    
    Node(int d) {
        data = d;
        next = null;
    }
}
    Node head;

    public void swapNodes(int x, int y) {
        if (x == y)
            return;

        Node prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        Node prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if (currX == null || currY == null)
            return;

        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;

        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data) {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        LL_swap llist = new LL_swap();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("\n Linked list before ");
        llist.printList();

        llist.swapNodes(4, 3);

        System.out.print("\n Linked list after ");
        llist.printList();
    }
}
