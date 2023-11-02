//Write a program to compress a string
public class string_compression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString(); // Move the return statement outside the loop
    }

    public static void main(String args[]) {
    System.out.print(compress("aaaabbbbbcccddefg"));
    }
}
