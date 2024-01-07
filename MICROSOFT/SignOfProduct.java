//There is a function signfunc(x) that returns 1 is x is positive -1 if x is negative and o is x=0
//You are given an integer array nums . Let product be the product of all the values in array nums

public class SignOfProduct {
    public static int sign(int nums[]) {
        int negativeCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0; // If there's a zero, product will be zero
            } else if (nums[i] < 0) {
                negativeCount++;
            }
        }

        // Check the count of negative numbers to determine the sign
        if (negativeCount % 2 == 0) {
            return 1; // Even count of negative numbers, product is positive
        } else {
            return -1; // Odd count of negative numbers, product is negative
        }
    }

    public static void main(String args[]) {
        int nums[] = {-1, -2, -3, -4, 3, 2, 1};
        System.out.println(sign(nums));
    }
}

