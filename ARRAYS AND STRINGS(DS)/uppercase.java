//Write a program to convert first letter of each word to uppercase
public class uppercase {
    public static String upprcase(String str) {
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String input = "this is a test string";
        String result = upprcase(input);
        System.out.println(result);
    }
}
