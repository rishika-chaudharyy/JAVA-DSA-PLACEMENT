//Write a program to use java collections framework in Linked list
import java.util.LinkedList;
public class LL_jcf {
    public static void main(String args[]){
        LinkedList<Integer> ll = new LinkedList<>();
         ll.addFirst(1);
         ll.addFirst(0);
         ll.addLast(2);

         System.out.println(ll);

         ll.removeLast();
         ll.removeFirst();

         System.out.println(ll);
    }
}
