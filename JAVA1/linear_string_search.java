//Write a program for linear search in an string array
import java.util.*;

public class linear_string_search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String array[] = new String[5];

        System.out.println("Enter Array elements");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element for index:" + i);
            array[i] = sc.nextLine();
        }

        System.out.println("Enter the target to find");
        String target = sc.nextLine();
        int result = -1; // Initialize result to -1

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target)) { // Use .equals() for string comparison
                result = i;
                break; // Once found, exit the loop
            }
        }

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + result);
        }

        sc.close();
    }
}
