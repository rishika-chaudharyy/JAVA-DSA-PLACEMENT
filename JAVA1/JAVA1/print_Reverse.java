//Write a program to print the reverse of the original number

public class print_Reverse {
    public static void main(String args[]){
        int n=100;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
        System.out.println();
    }
}
