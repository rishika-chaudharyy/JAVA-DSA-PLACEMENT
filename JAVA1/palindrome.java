//Write a program to check if a number is palindrome or not

public class palindrome{
    public static boolean palindrome_check(int n){
        int rev=0;
        int actual_n=n;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
            
        }
        if(actual_n==rev){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
    System.out.println(palindrome_check(313));
    }
}