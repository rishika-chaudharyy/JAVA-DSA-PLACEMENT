//Write a program to interleave two halves of a queue or even length
import java.util.*;

public class QueueInterleave {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> first = new LinkedList<>();
        int size = q.size();

        for(int i = 0; i < size / 2; i++){
            first.add(q.remove());
        }

        while(!first.isEmpty()){
            q.add(first.remove());
            q.add(q.remove());
        }
    }

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= 10; i++){
            q.add(i);
        }

        interleave(q);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}
