//Write a program to print true if an element occurs atleast twice else false
public class array_twice {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        boolean result = containsDuplicate(nums);
        System.out.println(result); // This will print true since 1 appears twice in the array.
    }
}
