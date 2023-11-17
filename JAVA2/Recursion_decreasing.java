//Write a program to print numbers in decreasing order using recursion
public class Recursion_decreasing {
    public static void print(int n){
        if(n==1){
            System.out.print("1"+" ");
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String args[]){
    print(10);
    }
}
