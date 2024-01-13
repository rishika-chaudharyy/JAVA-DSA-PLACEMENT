//Write a program to form a doubly linked list and also add and remove

import org.w3c.dom.Node;

public class DLL_basics {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add 
    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    //print
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;

        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
    
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String args[]){
      DLL_basics dll=new DLL_basics();
      dll.addFirst(1);
      dll.addFirst(2);
      dll.addFirst(3);
      dll.addFirst(4);

      dll.print();
      System.out.println(dll.size);
      dll.removeFirst();
      dll.print();
      System.out.println(dll.size);
      dll.reverse();
      dll.print();
    }
}
