//Write a program to reverse an array
public class array_reverse {
    public static void main(String args[]) {
        int array[] = {2, 3, 4, 5, 6, 7};
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
        
        System.out.print("REVERSED ARRAY IS: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
