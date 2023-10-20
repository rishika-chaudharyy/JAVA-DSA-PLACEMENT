//Write a program to pass array as an argument
public class array_argument {
    public static void updation(int array[], int value) {
        value = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + 1;
        }
    }

    public static void main(String args[]) {
        int array[] = { 97, 98, 99 };
        int value = 120;
        updation(array, value);
        System.out.println(value); // This will print 120 because 'value' is not modified in the 'updation' method

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // This will print the modified values of the 'array' [98 99 100]
        }
    }
}
