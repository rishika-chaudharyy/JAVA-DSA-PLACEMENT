//Write a program for optimized solution for water container

import java.util.ArrayList;

public class WaterContainerOptimized {
    public static int max_water(ArrayList<Integer> height){
        int max=0;
        int lp=0;
        int rp=height.size()-1;

        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wd=rp-lp;
            int water=ht*wd;
            max=Math.max(max,water);

            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return max;

        
    }
    public static void main(String args[]){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
       
        System.out.println(max_water(height));
    }
}
