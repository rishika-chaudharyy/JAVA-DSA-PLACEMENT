import java.util.*;
public class star_table{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int n=sc.nextInt();
        int nst=n;
        int nsp=1;
        for(int i=1;i<=2*n+1;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int a=1;a<=n;a++){
        for(int j=1;j<=nst;j++){
            System.out.print("*");
        }
        for(int k=1;k<=nsp;k++){
            System.out.print(" ");
        }
        for(int l=1;l<=nst;l++){
            System.out.print("*");
        }
        nst--;
        nsp+=2;
        System.out.println();
    } 
    sc.close();
    }
}