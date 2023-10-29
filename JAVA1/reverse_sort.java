//Write a program to sort an array in reverse order using all types of sorting

public class reverse_sort {
    //bubble sort 
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //selection
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++)
       {
        int minpos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minpos]<arr[j]){
                minpos=j;
            }
        }
        int temp=arr[minpos];
        arr[minpos]=arr[i];
        arr[i]=temp;
        }
    }
    //insertion
    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //counting
    public static void count(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
        largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;

            }
        }
    }  
      public static void main(String args[]){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        //bubble(arr);
        //selection(arr);
        insertion(arr);
       // count(arr);
        print(arr);
    }
}
