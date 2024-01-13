//Given head , head of the LL , determine if L has cycle in it . There is a cycle in a LL , 
//if there is some node in the list that can be reached again by continuously following 
//the next pointer. Internally pos , is used to denote the index of the node that tail's 
//next pointer is connected to . Note that pos is not passed as a parameter . Return true if 
//Cycle exists else false

public class LinkedListCycle {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next=head;

        System.out.println(isCycle());
    }
}
