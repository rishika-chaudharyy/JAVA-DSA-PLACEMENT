import java.util.*;
public class star_pyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int nst=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            nst=nst+2;
            System.out.println();
        }
        sc.close();
    }
}