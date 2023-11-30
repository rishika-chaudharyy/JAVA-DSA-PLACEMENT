//Write a program to find substring using backtracking
public class BacktrackingSubstrings {
    public static void substring(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        substring(str, ans + str.charAt(i), i + 1); // Yes
        substring(str, ans, i + 1); // No
    }

    public static void main(String args[]) {
        String str = "abc";
        substring(str, "", 0); // Initialize ans as an empty string
    }
}
