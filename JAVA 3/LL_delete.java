//Write a program to delete nth node from the end 
public class LL_delete 
   
 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addMiddle(int idx , int data){
        if(idx==0){
            addFirst(data);
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;//prev.next.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int search(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key) {
    if (head == null) {
        return -1;
    }
    if (head.data == key) {
        return 0;
    }
    int idx = helper(head.next, key); // Missing semicolon here
    if (idx == -1) {
        return -1;
    }
    return idx + 1;
}

public int recSearch(int key) {
    return helper(head, key); // Moved this method outside of the main method and fixed formatting
}

public void delete(int n){
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head=head.next;
        return;
    }
    int i=1;
    int itofind=sz-n;
    Node prev=head;
    while(i<itofind){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;
    return;

}
    public static void main(String args[]) {
        LL_delete ll = new LL_delete();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(5);
        ll.addMiddle(2,9);

        ll.print(); // Add this line to print the linked list
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.search(3));
        System.out.println(ll.search(10));
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        ll.delete(3);
        ll.print();
    }
}




   



