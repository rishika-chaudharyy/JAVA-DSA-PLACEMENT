//Write a program to print the majority element in an array
public class Majority {
    public static int count(int arr[], int si, int ei, int target) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static int majority(int arr[], int si, int ei) {
        if (si == ei) {
            return arr[si];
        }

        int mid = si + (ei - si) / 2;
        int a = majority(arr, si, mid);
        int b = majority(arr, mid + 1, ei);

        int counta = count(arr, si, ei, a);
        int countb = count(arr, si, ei, b);

        if (counta > countb) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 20, 20,20, 20, 30, 30, 30, 30 };
        System.out.print(majority(arr, 0, arr.length - 1));
    }
}
