//Write a program for Grid ways
public class GridWays {
    public static int gridways(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) {
            return 1; // Return 1 when you reach the bottom-right corner
        } else if (i >= n || j >= m) {
            return 0; // Return 0 when out of bounds
        }
        int w1 = gridways(i + 1, j, n, m); // Move down
        int w2 = gridways(i, j + 1, n, m); // Move right
        return w1 + w2;
    }

    public static void main(String args[]) {
        int n = 3, m = 3;
        System.out.println(gridways(0, 0, n, m));
    }
}
