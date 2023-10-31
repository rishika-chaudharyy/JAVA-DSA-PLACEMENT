//Write a program to search for an element by linear search 
//In MAIN- array input , target input , call function and store in variable,check if exists then print
//In FUNCTION-check for target in array
import java.util.*;
public class array_linear_search {
    public static int linear_search(int array[],int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements of array: "+(i+1));
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the target to search");
        int target=sc.nextInt();
        

        int result=linear_search(array,target);
        if(result==-1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found at index : "+result);
        }
        sc.close();
    }
}
