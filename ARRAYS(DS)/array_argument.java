//Write a program to pass an array as an argument 
//NOTE: array is always passed by call by reference while others call by value
//In MAIN: array create and value declare , calling function and printing array and value
//In FUNCTION: changes in array and value
import java.util.*;
public class array_argument {
    public static void argument(int array[],int value){
        value=80;
        for(int i=0;i<array.length;i++){
            array[i]=array[i]+1;           
        }
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int array[]=new int[5];
    int value=90;
    for(int i=0;i<array.length;i++){
        System.out.println("Enter the array element: "+(i+1));
        array[i]=sc.nextInt();
    }
    argument(array,value);
    for(int i=0;i<array.length;i++){//call by reference/changes
            System.out.print(array[i]+" ");           
        }
System.out.println(value);//call by value/no change
sc.close();
    }
}
