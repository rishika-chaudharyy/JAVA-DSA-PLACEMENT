//Write a program to sort an array using bubble sort and also write a code for optimized solution

public class bubble_sort {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,3,2,4,1};
        sort(arr);
        print(arr);
    }
}
