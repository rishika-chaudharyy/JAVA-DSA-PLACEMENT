//Given an valid Ip address ,return a defanged version of that ip address .
//A defanged Ip address replaces every period . with [.]


public class DefangedIpAddress {
    public static String defanged(String address) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                str.append("[.]");
            } else {
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String args[]) {
        String address = "1.1.1.1";
        System.out.println(defanged(address)); // Call the static method directly
    }
}
