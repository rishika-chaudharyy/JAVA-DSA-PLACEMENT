//Write a program to print the maximum subarray sum using kadanes algorithm
//1st loop cs=0 ms=-infinity
//if cs<0 cs=0
//The time complexity is O(n); better than both the methods

public class array_subarray_sum_kadanes {
    public static void kadanes(int array[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
        cs+=array[i];
        if(cs<0){
            cs=0;
        }
        if(cs>ms){
            ms=cs;
        }
        }
        System.out.println("The maximum sum is : "+ms);
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        kadanes(array);
    }
}
