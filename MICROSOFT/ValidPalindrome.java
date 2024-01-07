//A phrase is a palindrome if , after converting all uppercase letters into lowercase letters
//and removing all non-alphanumeric characters , if reads the same forward and backward 
//Alphanumeric characters include letters and numbers . Given a string s , return ture if palindrome or false otherwise
public class ValidPalindrome {
    public static boolean isPalindrome(String s ){
        int start=0;
        int last=s.length()-1;
        while(start<=last){
            if(!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if(!Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }else if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(last))){
                return false;
            }else{
                start++;
                last--;
            }

        }
        return true;
    }
    public static void main(String args[]){
        String s="A man , a plan , a canal : Panama";
        System.out.println(isPalindrome(s));

    }
}
