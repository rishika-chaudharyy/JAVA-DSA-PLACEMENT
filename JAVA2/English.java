//Write a program to convert a number into its english letter
public class English {
    public static void eng(int n){
        String letter[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return ;
        }
       int lastdigit=n%10;
       eng(n/10);
       System.out.print(letter[lastdigit]+" ");
    }
    public static void main(String args[]){
eng(1987);
    }
}
