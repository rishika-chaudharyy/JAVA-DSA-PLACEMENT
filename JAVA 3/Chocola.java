//Write a program for chocola problem
import java.util.*;

public class Chocola {
    public static void main(String args[]){
        int n=4 ; 
        int m=6 ;
        Integer costvert[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};

        Arrays.sort(costvert , Collections.reverseOrder());
        Arrays.sort(costhor , Collections.reverseOrder());

        int h=0;
        int v=0;
        int hp=1;
        int vp=1;
        int cost=0;

        while(h<costhor.length && v < costvert.length){
            if(costvert[v]<=costhor[h]){
                cost+=(costhor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(costvert[v]*hp);
                vp++;
                v++;

            }
        }
        while(h<costhor.length){
            cost+=(costhor[h]*vp);
                hp++;
                h++;
        }
        while(v<costvert.length){
            cost+=(costvert[v]*hp);
                vp++;
                v++;
        }
        System.out.println(cost);

    }
}
