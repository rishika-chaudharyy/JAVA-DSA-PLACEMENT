/*Given an integer array nums sorted in a non descending order ,
 * remove the duplicates in place such that each unique elements appears only once .
 * Return k after placing the final results in the first k slots of nums.
 */

public class RemoveDuplicates {
    public static int removeDuplicates(int nums[]) {
        int k=1;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                k++;
            }
        }
        System.out.println("The value of k is "+k);
        return i + 1;
        
    }

    public static void main(String args[]) {
        int nums[] = {0, 1, 1, 1, 2, 2, 3};
        int length = removeDuplicates(nums);

        
        // Displaying the modified array after removing duplicates
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
