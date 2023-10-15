//Write a program to convert binary number to decimal number

public class binary_decimal{
    public static void binarytodecimal(int binnum){
        int decnum=0;
        int pow=0;
        int actual_bin=binnum;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("The decimal of the number "+actual_bin+" is "+decnum);
    }
    public static void main(String args[]){
        binarytodecimal(1000);
    }
}