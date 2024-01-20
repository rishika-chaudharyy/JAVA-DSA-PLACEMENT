//Write a program for trapping rainwater using stacks
import java.io.*;
import java.util.*;

class Solution {
    public static int maxWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int n = height.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[stack.peek()] < height[i]) {
                int popHeight = height[stack.peek()];
                stack.pop();

                if (stack.isEmpty())
                    break;

                int distance = i - stack.peek() - 1;
                int minHeight = Math.min(height[stack.peek()], height[i]) - popHeight;
                ans += distance * minHeight;
            }
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.print(maxWater(arr));
    }
}
