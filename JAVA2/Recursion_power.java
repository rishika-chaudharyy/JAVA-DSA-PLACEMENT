//Write a program to print the power using recursion
public class Recursion_power {
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void main(String args[]){
    System.out.println(power(2,5));
    }
}
