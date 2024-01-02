//Write a program for frequent number following key
import java.util.*;

public class ArrayList_frequent {

    public static int mostFrequent(ArrayList<Integer> list, int key) {
        int[] result = new int[1000];
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) == key) {
                result[list.get(i + 1) - 1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(8);
        list.add(2);
        list.add(10);
        list.add(2);
        list.add(10);
        list.add(2);
        list.add(2);
        int key=2;

        System.out.println(mostFrequent(list,key));
    }
}
