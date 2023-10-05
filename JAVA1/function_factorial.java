//write a function to find factorial of a number

public class function_factorial {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
            return fact;
        
    }
    public static void main(String args[]){
    System.out.println(factorial(4));
    }
}
