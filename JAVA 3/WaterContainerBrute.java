//Write a brute force approach for maximum water stored in a container
import java.util.*;
public class WaterContainerBrute {
    public static int max_water(ArrayList<Integer> height){
        int max=0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int max_height=Math.min(height.get(i), height.get(j));
                int max_width=j-i;
                int maxi_water=max_height*max_width;
                max=Math.max(maxi_water,max);

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
