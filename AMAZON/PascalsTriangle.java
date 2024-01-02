//Given an integer n , print the first n rows of pascal triangle.
//In a pascal's triangle , each number is the sum of the tweo numbers directly above it as shown

import java.util.*;

public class PascalsTriangle {
    public static void pattern(int n) {
        int ans[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { // Change made here
                if (i == j || j == 0) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
                }
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();

        pattern(n);
        sc.close();
    }
}
