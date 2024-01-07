//Given an integer x , return true if x is palindrome and false otherwise
public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        int original = x; // Store the original value
        int rev = 0;
        if(x<0){
            return false;
        }
        while(x > 0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }
        return original == rev; // Compare with the original value
    }

    public static void main(String args[]){
        int x = 345;
        System.out.println(isPalindrome(x));
    }
}

