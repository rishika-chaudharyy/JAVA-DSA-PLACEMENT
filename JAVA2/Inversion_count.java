//Write a program for inversion sort
public class Inversion_count {
    public static int merge(int arr[], int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = 0;
        int count = 0;
        int temp[] = new int[right - left + 1];

        while (i < mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i); // Update inversion count
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }
        return count;
    }

    private static int mergeSort(int arr[], int left, int right) {
        int count = 0;
        if (right > left) {
            int mid = (right + left) / 2;
            count = mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid + 1, right);
        }
        return count;
    }

    public static int getInversions(int arr[]) {
        int n = arr.length;
        return mergeSort(arr, 0, n - 1);
    }

    public static void main(String args[]) {
        int arr[] = { 5,5, 5 };
        System.out.println("Inversion Count = " + getInversions(arr));
    }
}
