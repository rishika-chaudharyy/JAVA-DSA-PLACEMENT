//Write a program for basic deque operations

import java.util.*;

public class Dequebasic {
    public static void main(String args[]) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1);
        q.addFirst(2);
        System.out.println(q);
        q.removeFirst();
        System.out.print(q.getFirst());
    }
}
