//Write a program for beautiful arraylist

import java.util.ArrayList;

public class BeautifulArrayList {

    public ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (n == 1) {
            result.add(1);
            return result;
        }

        ArrayList<Integer> odds = beautifulArray((n + 1) / 2);
        ArrayList<Integer> evens = beautifulArray(n / 2);

        for (int odd : odds) {
            result.add(2 * odd - 1);
        }

        for (int even : evens) {
            result.add(2 * even);
        }

        return result;
    }

    public static void main(String args[]) {
        BeautifulArrayList beautifulArrayObj = new BeautifulArrayList();
        ArrayList<Integer> beautifulResult = beautifulArrayObj.beautifulArray(4);

        System.out.println("Beautiful Array: " + beautifulResult);
    }
}
