import java.util.*;
public class palindromic_number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Adjust the number of rows as needed
        System.out.println("Enter rows");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print spaces before the numbers
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print decreasing numbers from i to 1
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            // Print increasing numbers from 2 to i
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            // Move to the next line
            System.out.println();
        }
        sc.close();
    }
}

