//Given an array nums containing n distinct numbers in the range [0,n],return the only
//number in the range that is missing from the array
public class MissingNumber {

    public static int missingElement(int nums[])
    {
        int n_xor = nums.length; // Initializing with array length
        for(int i = 0; i < nums.length; i++){
            n_xor = n_xor ^ i ^ nums[i]; // XOR with loop variable i and nums[i]
        }
        return n_xor;
    }

    public static void main(String args[])
    {
        int nums[] = {3, 0, 1};
        System.out.println("Missing element in the range is " + missingElement(nums));
    }
}
