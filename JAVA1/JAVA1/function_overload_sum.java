//Write a function to calculate sum of two as well as three numbers;

public class function_overload_sum {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a , int b , int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
    System.out.println(sum(4,5));
    System.out.println(sum(3,4,6));
    System.out.println(sum(3.4f,4.6f));
    }
}
