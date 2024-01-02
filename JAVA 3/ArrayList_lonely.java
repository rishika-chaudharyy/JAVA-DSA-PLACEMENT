//Write a program for lonely numbers in an arraylist4
import java.util.*;
public class ArrayList_lonely{
    public static void lonely(ArrayList<Integer> list){
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if((i==0 || list.get(i)-1 != list.get(i-1)) && (i==list.size()-1 || list.get(i)+1 != list.get(i+1))){
                System.out.println(list.get(i));
            }
        }

    }
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(1);
        list.add(2);

        
    lonely(list);

    }
}
