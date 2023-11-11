//Write a program to print the percentage of marks by using arrays
import java.util.*;
public class array_percentage {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[5];
        for(int i=0;i<marks.length;i++){//.length function finds the length of the array
            System.out.println("Enter the marks for subject: "+(i+1));
            marks[i]=sc.nextInt();
        }
        int total_marks=500;
        int obtained_marks=0;
        for(int i=0;i<marks.length;i++){
            obtained_marks+=marks[i];
        }
        double percentage = ((double)obtained_marks/total_marks)*100;
        System.out.println("The percentage is : "+percentage);
        sc.close();
    }
}
