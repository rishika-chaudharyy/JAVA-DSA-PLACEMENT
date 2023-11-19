//Write a program to check for palindromic string using recursion
public class Palindromic_string {
    

        public static boolean isPalindrome(String str) {
            // Base case: if the string is empty or has only one character, it's a palindrome
            if (str.length() <= 1) {
                return true;
            } else {
                // Check if the first and last characters are the same
                char firstChar = str.charAt(0);
                char lastChar = str.charAt(str.length() - 1);
    
                if (firstChar == lastChar) {
                    // Recursively check if the substring excluding the first and last characters is a palindrome
                    return isPalindrome(str.substring(1, str.length() - 1));
                } else {
                    // If the first and last characters are different, it's not a palindrome
                    return false;
                }
            }
        }
    
        public static void main(String[] args) {
            String testStr = "racecar";
            if (isPalindrome(testStr)) {
                System.out.println(testStr + " is a palindrome.");
            } else {
                System.out.println(testStr + " is not a palindrome.");
            }
        }
    }
    

