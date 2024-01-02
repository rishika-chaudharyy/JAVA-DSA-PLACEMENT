//Write a program for monotonic arraylist
import java.util.*;
public class ArrayList_monotonic {
    public static boolean monotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i <list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1))
                inc = false;
            if (list.get(i) < list.get(i + 1))
                dec = false;
        }
        return inc || dec;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(70);
        list.add(1);
        System.out.println(monotonic(list));

    }
}
