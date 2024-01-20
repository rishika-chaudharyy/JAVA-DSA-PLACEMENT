//Given an integer n , return the whole nth row of the pascals triangle
public class KthRow_Pascal {
    public static int[] getRow(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                ans[j] += ans[j - 1];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int k = 3;
        int[] result = getRow(k);
        
        // Print the result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
