//Write a program to calculate area of a square

import java.util.*;
public class area_square {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        sc.close();
        int area=side*side;
        System.out.print("Area is:"+area+"cm^2");
        
    }
}