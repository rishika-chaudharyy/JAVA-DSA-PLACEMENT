//Write a program to pass an array as an argument
import java.util.*;
public class array_argument{
    public static void argument(int array[],int value){
        value=5;
        for(int i=0;i<array.length;i++){
            array[i]=array[i]+1;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int value=10;
        int array[]={1,2,3,4,5};
        argument(array,value);
        System.out.println(value);//This is call by value in which original value of does not argument changes
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");//This is call by reference in which original value of argument changes
        }
        sc.close();
    }
}
