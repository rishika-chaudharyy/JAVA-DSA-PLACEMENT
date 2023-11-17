//Tower of hanoi
public class Tower_hanoi {
    public static void tower(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        tower(n - 1, src, dest, help);
        System.out.println("Transfer disk " + n + " from " + src + " to " + help);
        tower(n - 1, help, src, dest);
    }

    public static void main(String args[]) {
        int n = 3;
        tower(n, "A", "B", "C");
    }
}
