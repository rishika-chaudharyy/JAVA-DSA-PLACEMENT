public class test {
    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 3, 1, 4};
        int maxFreq = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 1; 

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

           
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        System.out.println("Maximum frequency: " + maxFreq);
    }
}
