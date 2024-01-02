//Write a program to find maximum in an ArrayList

import java.util.ArrayList;

public class ArrayList_max {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(14);
        list.add(5);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        System.out.println("Maximum value is "+max);
    }
    
}
