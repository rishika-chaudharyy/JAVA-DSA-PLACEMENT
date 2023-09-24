//Write a program to calculate area of a circle

import java.util.*;
public class area_circle {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        float area=3.14f*radius*radius; //3.14f to specify float value otherwise java will consider it as double value
        System.out.println(area);
        sc.close();
    }
}