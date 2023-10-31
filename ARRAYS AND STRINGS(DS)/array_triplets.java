//Write a program to print all the triplets in array without duplicate triplets

public class array_triplets {
    public static void threeSum(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        System.out.print("[");
                        System.out.print(nums[i] + ", " + nums[j] + ", " + nums[k]);
                        System.out.println("]");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }
}
