//Write a program to print all the subarrays in the array
//total subarrays=n(n+1)/2
//In MAIN- array input , call function
//In FUNCTION- int ts;
//1st i loop from 0 to array.length
//2nd j loop from j=i to array.length
//3rd  k loop from i to j and print array[k]
//ts++ print the subarrays and total subarrays
public class array_subarrays {
    public static void subarrays(int array[]){
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
          System.out.println("Total subarrays is : "+ts);              
    }
                        

    
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6,7};
        subarrays(array);
    }
}
