//Write a program to sort an ArrayList
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
public class ArrayList_sort {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(5);
        list.add(90);
        list.add(67);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
