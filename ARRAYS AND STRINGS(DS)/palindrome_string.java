//Write a program to check for palindrome string
public class palindrome_string {
    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "montu";
        boolean isPalindrome = ispalindrome(str);
        System.out.println(isPalindrome);
    }
}
