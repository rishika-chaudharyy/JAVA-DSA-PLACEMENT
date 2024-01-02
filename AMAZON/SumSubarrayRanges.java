//You are given an integer array nums. The range of a subarray of nums is the difference 
//between the largest and the smallest element in the subarray .
//Return the sum of all the subarrays ranges in the nums.

public class SumSubarrayRanges {

    public static long sum(int nums[]) {
        int n = nums.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                ans += max - min;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3 };
        System.out.println("The sum is " + sum(nums));
    }
}
