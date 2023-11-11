//Write a program to print the largest and the smallest element of the array
//In MAIN-array input,call function and store in variable and print the max and min
//In FUNCTION_LARGEST-max variable=Integer.MIN_VALUE and then compare the elements of array with max
//if max<array element then max=array element
//In FUNCTION_SMAllLLEST-min variable=Integer.MAX_VALUE and then compare the elements of array with min
//if min>array element then min=array element
import java.util.*;
public class array_largest_smallest{
    public static int largest(int array[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    
    public static int smallest(int array[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
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
 int largest=largest(array);
 int smallest=smallest(array);
 System.out.println("The largest element is : "+largest);
 System.out.println("The Smallest element is : "+smallest);
 sc.close();
}
}