//Write a program to calculate the trapped water
public class trapped_water_important {
    public static int trapped_water(int array[]) {
        int n = array.length;
        if (n == 0) {
            return 0; // Handle the case of an empty array
        }

        int[] left_max = new int[n]; // Array to store the left max heights
        int[] right_max = new int[n]; // Array to store the right max heights

        // Calculate left_max for each position
        left_max[0] = array[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], array[i]);
        }

        // Calculate right_max for each position
        right_max[n - 1] = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], array[i]);
        }

        int trapped_water = 0;

        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            trapped_water += water_level - array[i];
        }

        return trapped_water;
    }

    public static void main(String args[]) {
        int array[] = {4, 2, 0,  3, 2, 5};
        System.out.println(trapped_water(array));
    }
}
