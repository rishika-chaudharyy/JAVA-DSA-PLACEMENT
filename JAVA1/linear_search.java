//Write a program for linear search in an integer array
import java.util.*;
public class linear_search {
    public static int linear(int array[],int target){
    for(int i=0;i<array.length;i++){
        if(array[i]==target){
          return i;
        
        }
        
    }
    return -1;
}
    public static void main(String args[]){
        int array[]=new int[5];
        Scanner sc= new Scanner(System.in);
        
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements of array "+(i));
            array[i]=sc.nextInt();
        }
     System.out.println("Enter the target to find");
     int target=sc.nextInt();
     int result=linear(array,target);
     if(result==-1){
System.out.println("Target not found");
     }else{
        System.out.println("Target found at index "+result);
     }
     sc.close();
    }
    
}
