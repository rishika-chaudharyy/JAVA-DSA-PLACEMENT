//Write a program to lexicographically print the smallest string of length n and sum k
public class Lexicographically {
    public static void main(String args[]) {
        int n = 5;
        int k = 85;
        int kk = k - n;
        StringBuilder s = new StringBuilder(); // Use StringBuilder to build the string
        for (int i = n - 1; i >= 0; i--) {
            if (kk >= 25) {
                s.append('z');
                kk -= 25;
            } else {
                s.append((char) ('a' + kk));
                kk -= kk;
            }
        }
        String ans = s.reverse().toString(); // Reverse the StringBuilder to get the correct order
        System.out.println(ans);
    }
}
