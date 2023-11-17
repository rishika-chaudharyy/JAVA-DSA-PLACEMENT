//Write a program to print numbers in increasing order using recursion
public class Recursion_increasing {
    public static void print(int n){
        if(n==1){
            System.out.print("1"+" ");
            return ;
        }
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String artgs[]){
    print(5);
    }
}
