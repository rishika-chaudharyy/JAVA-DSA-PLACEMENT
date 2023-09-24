//Write a program to use logical operators
 public class logical_operators {
    public static void main( String args[]) {
        int a=10;
        int b=90;
        int c=30;
        System.out.println((a>b) && (c>a));
        System.out.println((a>b) || (c>a));
        System.out.println(!((a>b) || (c>a)));

    }
 }