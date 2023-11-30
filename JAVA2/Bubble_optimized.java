//Optimized bubble sort
public class Bubble_optimized {
    public static void main(String args[]){
        int arr[]={1,4,5,6,3,2};
        for(int i=0;i<arr.length-1;i++){
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++){ // Fixed condition from i to j
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped!=true)
                break;
        }
        // Add code to print or use the sorted array
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
