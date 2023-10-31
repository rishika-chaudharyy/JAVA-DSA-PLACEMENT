//Write a program to search for a target using binary search
//prerequisites-sorted array
//In MAIN- array input,target input,call function and store in variable and print the answer
//In FUNCTION-start=0,end=n-1,mid=(start+end)/2, mid<target then start=mid+1,mid>target then end=mid-1
import java.util.*;
public class array_binary_search {
    public static int binary_search(int array[],int target){
        
        int start=0;
        int end=array.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(array[mid]==target){
                return mid;
            }else if(array[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the element of array: "+(i+1)) ;
            array[i]=sc.nextInt();
    }
    System.out.println("Enter the target");
    int target=sc.nextInt();
    int result=binary_search(array,target);
    if(result==-1){
        System.out.println("Target not found");
    }else{
        System.out.println("Target found at index: " +result);
    }
sc.close();
}
}
