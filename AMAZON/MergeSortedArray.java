//You are given two integer arrays nums1 and nums2 , sorted in a non-decreasing order
//and m and n , two integers respresenting the number of elements in nums1 and nums2 respectively
//Merge nums1 and nums2 into a single sorted array in non-decreasing order
//NOTE :The final sorted array should not be returned to the function but instead be stored inside the array nums1
//To accomodate this nums1 has length of m+n
public class MergeSortedArray {
    public static void mergeArray(int nums1[], int nums2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int x = (m + n) - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[x] = nums1[i];
                i--;
            } else {
                nums1[x] = nums2[j];
                j--;
            }
            x--;
        }

        while (j >= 0) {
            nums1[x] = nums2[j];
            j--;
            x--;
        }
    }

    public static void main(String args[]) {

        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3;
        int n = 3;

        mergeArray(nums1, nums2, m, n);

        for (int i = 0; i < 6; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
}
