//Write a program to print variables and their assigned values

public class variables {
    public static void main(String args[]) {
        int a =10;
        int b=20;
        System.out.println("a"); //this will just print a and not the value assigned to a 
        System.out.println(a);
        System.out.println(b);
        a=60;
        System.out.println(a);
        b=20;
        a=b;
        System.out.println(a);
    }

}