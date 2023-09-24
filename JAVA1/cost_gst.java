//Write a program to enter three prices and calculate the cost with gst and present them as a bill

import java.util.*;
public class cost_gst {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("Bill is:"+total);
        //Bill with gst
        float gst=total+(0.18f*total);
        System.out.print("Bill with gst:"+gst);
        sc.close();
    }
}