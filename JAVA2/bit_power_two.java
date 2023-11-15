//Write a program to find if a number can be converted to the power of 2
public class bit_power_two {
    public static boolean ispowertwo(int n){
    return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(ispowertwo(3));
    }
}
