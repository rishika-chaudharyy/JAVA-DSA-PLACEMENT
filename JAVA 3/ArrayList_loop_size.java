//Write a program for size of Arraylist and looping over it.
import java.util.*;
public class ArrayList_loop_size {
 
    public static void main(String args[]){

        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<5;i++){

            list.add(i);
        }
        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            
            System.out.println(list.get(i));
        }
    }
}
