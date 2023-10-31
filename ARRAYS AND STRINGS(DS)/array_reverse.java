//Write a program to reverse an array
//In MAIN - array input , call function
//In FUNCTION- start=0, end =array,length-1,whle sorted, temp=end,end=start,start=temp start++ end-- print array

public class array_reverse {
    public static void reverse(int array[]){
        int start=0;int end=array.length-1;
    while(start<=end){
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        start++;
        end--;
    }
    for(int i=0;i<array.length;i++){
        System.out.print(array[i]+" ");
    }
    }
   public static void main(String args[]){
    int array[]={5,4,1,2,7};
    reverse(array);
    
   } 
}
