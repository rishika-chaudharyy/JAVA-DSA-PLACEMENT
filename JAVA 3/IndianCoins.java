//Write a program for Indian Coins
import java.util.*;

public class IndianCoins {
    public static void main(String args[]) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int count = 0;
        int val = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= val) {
                count++;
                ans.add(coins[i]);
                val -= coins[i];  // Corrected: subtract the coin value from the remaining value
            }
        }

        System.out.println(count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
