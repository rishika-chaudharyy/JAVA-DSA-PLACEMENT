//Write a program to find the sum of digits of a number

public class sum_digits {
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
            
        }
        return sum;
    }
    public static void main(String args[]){
    System.out.println(sum(191));
    }
}
