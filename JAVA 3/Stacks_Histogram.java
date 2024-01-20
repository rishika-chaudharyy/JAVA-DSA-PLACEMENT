//Write a program to find the maximum area in a Histogram
import java.util.*;

public class Stacks_Histogram {
    public static void area(int heights[]) {
        int max = 0;
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];
        Stack<Integer> s = new Stack<>();

        // Finding next smaller to the right
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        // Finding next smaller to the left
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // Assuming -1 for elements without smaller element to the left
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int areaa = height * width;
            max = Math.max(max, areaa);
        }
        System.out.println(max);
    }

    public static void main(String args[]) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };
        area(heights);
    }
}
