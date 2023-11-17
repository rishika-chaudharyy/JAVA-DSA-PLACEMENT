//Optimized program for power
public class Recursion_power_optimized {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        int halfpower=power(x,n/2);
        int halfpowsq=halfpower*halfpower;
        if(n%2!=0){
       halfpowsq=x*halfpowsq;
        }
        return halfpowsq;
    }
    public static void main(String args[]){
   System.out.println(power(2,5));
    }
}
