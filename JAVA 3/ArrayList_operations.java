//Write a program for operations on ArrayLists
import java.util.ArrayList;
public class ArrayList_operations{

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); //O(1);
        list.add(1,2);//O(n)
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list);
        list.set(2,9);
        System.out.println(list);
         System.out.println(list.contains(6));


    }
}