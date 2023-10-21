//Write a program for linear search in an string array
import java.util.*;
public class linear_string_search{
    public static int linear_search(String array[],String target){
    for(int i=0;i<array.length;i++){
        if(array[i].equals(target)){
            return i;
        }
    }
    return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String array[]=new String[5];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter the elements of: "+i);
            array[i]=sc.nextLine();
        }
        System.out.println("Enter the target");
        String target=sc.nextLine();
        int result=linear_search(array,target);
        if(result==-1){
            System.out.println("Target not found");
        }else{
            System.out.println("Target found at index:"+result);
        }
        sc.close();
    }

}