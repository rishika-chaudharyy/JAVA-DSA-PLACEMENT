//Write a program to return true if array is monotone else return false
public class array_monotones {
    public static boolean isIncreasing(int array[]){
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;

    }
    public static boolean isDecreasing(int array[]){
        for(int i=0;i<array.length-1;i++){
            if(array[i]<array[i+1]){
                return false;
            }
        }
        return true;

    }
    public static boolean ismonotonic(int array[]){
        
         boolean x=isIncreasing(array);
         boolean y=isDecreasing(array);
         return x || y;
    }

public static void main(String args[]){
int array[]={1,2,3,4,4};
System.out.println(ismonotonic(array));
}
}