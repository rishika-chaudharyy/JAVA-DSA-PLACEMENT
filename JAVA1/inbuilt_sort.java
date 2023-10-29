//Write a program to use inbuilt sorting function
import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {
    public static void main(String args[]) {
        int arr1[]={1,4,5,3,2};
        Arrays.sort(arr1);
        Integer arr[] = {3, 4, 5, 2, 1}; // Note: Use Integer instead of int to make use of Collections.reverseOrder()
        Arrays.sort(arr,0,3, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
