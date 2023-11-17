//Write a program to print sum of numbers using recursion
public class Recursion_sum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
    return n+sum(n-1);
    }
    public static void main(String args[]){
    System.out.print(sum(5));
    }
}
