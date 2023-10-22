//Write a program to print the maximum subarray sum
//In MAIN-array input , call function
//In FUNCTION- current sum(cs)=0; max sum(ms)=Integer.MIN_VALUE calculate current sum and compare with max sum
//if cs>ms cs=ms;
//return max_sum
//In this the time complexity is O(n^3)

import java.util.*;
public class array_subarray_sum_bruteforce{
    public static void subarray(int array[]){
        int ts=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(array[k]);
                    
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
      System.out.println("Total subarrays are:"+ts);  
    }
    public static int subarray_sum(int array[]){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            
            for(int j=i;j<array.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    sum=sum+array[k];
                    
                }
                System.out.println(sum);
                if(sum>max){
                    max=sum;
                }   
            } 
        }
        
       return max; 
    }
    
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int array[]=new int[5];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter elements at index: "+i);
            array[i]=sc.nextInt();
            
        }
        subarray(array);
        int result=subarray_sum(array);
        System.out.println("The largest sum is "+ result);
        sc.close();
    }
}