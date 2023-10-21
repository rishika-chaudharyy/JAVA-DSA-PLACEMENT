//Write a program to print the possible sub arrays
public class subarrays {
    public static void sub(int array[]){
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
        System.out.println("Total subarrays are: "+ts);
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        sub(array);
    }
}
