//Write a program to print lonely elements in an array
import java.util.Arrays;

public class array_lonely {
    public static void lonely(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] - 1 != arr[i - 1]) && (i == arr.length - 1 || arr[i] + 1 != arr[i + 1])) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 5, 6, 8};
        lonely(arr);
    }
}
