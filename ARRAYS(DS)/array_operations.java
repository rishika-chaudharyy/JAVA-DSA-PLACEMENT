//With array we can perform some operations. 1. creating an array 2.input elements in array
//3.print elements of array 4.updation of array
import java.util.*;
public class array_operations{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String alpha[]=new String[5];  //Creating
        System.out.println("Enter the first element"); //Input
        alpha[0]=sc.nextLine();
        System.out.println("Enter the second element");
        alpha[1]=sc.nextLine();
        System.out.println("Enter the third element");
        alpha[2]=sc.nextLine();
        System.out.println("Enter the fourth element");
        alpha[3]=sc.nextLine();
        System.out.println("Enter the fifth element");
        alpha[4]=sc.nextLine();

        for(int i=0;i<alpha.length;i++){ //Printing
            System.out.println(alpha[i]);
        }
        alpha[3]="w"; //Updation
        System.out.println(alpha[3]);
        sc.close();
    }
}