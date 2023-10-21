//Write a program to calculate maximum subarray sum using Kadanes's algorithm
public class subarray_sum_kadanes {
    public static void Kadanes(int array[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<array.length;i++){
            
            cs=cs+array[i];
            if(cs<0){
                cs=0;
            }
            
            ms=Math.max(cs,ms);
        }
        System.out.println("Maximum is + "+ms);
    }
    
   public static void main(String args[]){
    int array[]={-2,-3,4,-1,-2,1,5,-3};
    Kadanes(array);
   } 
}
