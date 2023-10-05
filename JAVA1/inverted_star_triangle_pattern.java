//Print pattern

import java.util.*;

public class inverted_star_triangle_pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close(); // Close the Scanner outside the loop
    }
}
