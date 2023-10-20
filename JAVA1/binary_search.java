//Write a program for binary search
public class binary_search {
    public static int binary(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                return mid; // Key found, return the index
            } else if (array[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Key not found
    }

    public static void main(String args[]) {
        int array[] = {2, 3, 4, 5, 6, 7, 10};
        int key = 10;
        int result = binary(array, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
