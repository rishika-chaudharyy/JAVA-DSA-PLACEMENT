//Write a program for activity selection
import java.util.*;

public class ActivitySelection {
    
    public static void main(String args[]){

        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9}; //Already sorted if not we need to sort

        int activities[][]= new int[start.length][3];
        for(int i=0;i< start.length ; i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

        //lamba function --> short form
        //Arrays.sort(activities , Comparator.comparingDouble(0 -> o[2]));
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));


        int maxAct=0;
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(activities[0][0]);
        maxAct=1;

        int lastend = activities[0][2];

        for(int i = 1 ; i < end.length ; i++){

            if(activities[i][1] >= lastend){
                maxAct++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }
        System.out.println("Maximum activities = "+maxAct);
        for(int i =0 ; i < ans.size() ; i++){
            System.out.println(ans.get(i));
        }
    }
}
