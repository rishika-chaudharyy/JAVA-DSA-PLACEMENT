//Write a program to print the largest and the smallest in an array
import java.util.*;

public class largest_smallest_array {
    public static int findLargest(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findSmallest(int array[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = 10;
        int array[] = new int[arraySize];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = sc.nextInt();
        }

        int largest = findLargest(array);
        int smallest = findSmallest(array);

        System.out.println("The largest element is: " + largest);
        System.out.println("The smallest element is: " + smallest);

        sc.close();
    }
}
