//Write a program to check even and odd in bits
public class bit_even_odd {
    public static void check(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
    public static void main(String args[]){
        check(3);
        check(11);
        check(0);
    }
}
