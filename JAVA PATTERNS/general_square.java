import java.util.*;

public class general_square {
    public static void square(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rows");
    int n=sc.nextInt();
    sc.close();
    square(n);
    }
}
