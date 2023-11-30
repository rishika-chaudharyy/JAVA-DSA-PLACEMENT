//Write a program for backtracking in arrays
public class BacktrackingArray {
    public static void change_array(int arr[],int i, int val){
        if(i==arr.length){
            print(arr);
            return;
        }
        arr[i]=val;
        change_array(arr,i+1,val+1);//function call
        arr[i]=arr[i]-2;//Backtracking statement always written after function call
 
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        change_array(arr,0,1);
        print(arr);
    }
}
