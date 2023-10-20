//Write a program to create an array and input elements and print the array also updation
import java.util.*;
public class array_basics {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String fruits[]={"apple","mango","strawberry"};
        int array_marks[]=new int[4];
        System.out.println("Enter the marks of Physics");
        array_marks[0]=sc.nextInt();
        System.out.println("Enter the marks of Chemistry");
        array_marks[1]=sc.nextInt();
        System.out.println("Enter the marks of ED");
        array_marks[2]=sc.nextInt();
        System.out.println("Enter the marks of ECE");
        array_marks[3]=sc.nextInt();
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println("Physics marks:"+array_marks[0]);
        System.out.println("Chemistry marks:"+array_marks[1]);
        System.out.println("ED marks:"+array_marks[2]);
        System.out.println("ECE marks:"+array_marks[3]);
        array_marks[2]=100;
        System.out.println("ED marks:"+array_marks[2]);
        sc.close();
    }
}
