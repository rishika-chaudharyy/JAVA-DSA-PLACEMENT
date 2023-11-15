//Write a program to swap two numbers using bit operator
//x=x^y y=x^y=(x^y)^y=x^y=x hence swapped
public class bit_swap {
    public static void main(String args[]){
        int x=6;
        int y=8;
        x=x^y;
        y=y^x;
        x=x^y;
        System.out.println(x);
        System.out.println(y);
    }
}
