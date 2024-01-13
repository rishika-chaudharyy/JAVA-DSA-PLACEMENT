//Given a string s , return the string after replacing every uppercase letter with the same lowercase letter

public class LowerCase {
    public String toLowercase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return String.valueOf(chars); // Convert char array back to string
    }

    public static void main(String args[]) {
        LowerCase lc = new LowerCase(); // Need an instance of the class to call non-static methods
        String s = "Hello world";
        System.out.println(lc.toLowercase(s)); // Call the method using the instance 'lc'
    }
}
