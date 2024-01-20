//Write a program to connect ropes with minimum cost

import java.util.*;

public class QueueRopes {
    public static int minprice(int ropes[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<ropes.length;i++){
            pq.add(ropes[i]);

        }
         int cost =0;
        while(pq.size()>1){
            int small=pq.poll();
            int secsmall=pq.poll();

            cost+=small+secsmall;
            int newrope=small+secsmall;
            pq.add(newrope);
        }
        return cost;
    }
    public static void main(String args[]){
        int ropes[]={4,3,2,6};
        System.out.println(minprice(ropes));

    }
}
