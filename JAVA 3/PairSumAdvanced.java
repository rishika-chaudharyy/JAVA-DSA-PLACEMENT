//Write a program for pair sum in sorted and rotated arraylist
import java.util.*;
public class PairSumAdvanced {
    public static boolean exists(ArrayList<Integer> list, int target){
        int bp=-1;
        int n=list.size();
    
        for(int i=0; i < list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;

            }
        }
        int lp=bp+1;
        int rp=bp;
        while (lp != rp) {
            int sum = list.get(lp) + list.get(rp);
            if (sum == target) {
                return true;
            } else if (sum < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (rp - 1 + n) % n;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target=1;
        System.out.println(exists(list,target));
    }
}
