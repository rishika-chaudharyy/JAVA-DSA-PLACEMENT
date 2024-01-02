//Write a program to add first and add last in linkedlist
public class LL_addFirstLast{
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

    public void addFirst(int data){
        //Creating new node
        Node newnode=new Node(data);

        if(head==null){
            head=tail=newnode;
            return;
        }

        //newnode next=head
        newnode.next=head;

        //head=newnode
        head=newnode;

    }

    public void addLast(int data){
        //creating new node
        Node newnode=new Node(data);
        if(head==null){
            head=tail=newnode;
            return;
        }

        //tail next=new node
        tail,next=newnode;

        //tail=newnode
        tail=newnode;
    }
    public static void main(String args[]){
        LL_addFirstLast ll= new LL_addFirstLast();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addlast(3);
        ll.addlast(4);
        

    }
}