//Given a string s , return the longest palindromic substring in s
public class LongestPalindromicSubstring {
    public static void findPalString(String s){
        int start = 0, end = 1;

        for (int i = 0; i < s.length(); i++) {
            int l = i, r = i;

            while (l > 0 && r < s.length() - 1 && s.charAt(l - 1) == s.charAt(r + 1)) {
                l--;
                r++;
            }

            if (r - l + 1 > end) {
                start = l;
                end = r - l + 1;
            }

            l = i;
            r = i + 1;

            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }

            if (r - l - 1 > end) {
                start = l + 1;
                end = r - l - 1;
            }
        }

        for (int i = start; i < start + end; i++) {
            System.out.print(s.charAt(i));
        }
    }
    
    public static void main(String args[]){
        String s = "babad";
        findPalString(s);
    }
}
