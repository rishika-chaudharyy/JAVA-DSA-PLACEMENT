import java.util.*;
public class number_table{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int n=sc.nextInt();
        int nst=n;
        int nsp=1;
        for(int i=1;i<=2*n+1;i++){
            System.out.print(i);
        }
        System.out.println();
        for(int a=1;a<=n;a++){
            int z=1;
        for(int j=1;j<=nst;j++){
            System.out.print(z);
            z++;
        }
        for(int k=1;k<=nsp;k++){
            System.out.print(" ");
            z++;
        }
        for(int l=1;l<=nst;l++){
            System.out.print(z);
            z++;
        }
        nst--;
        nsp+=2;
        System.out.println();
    } 
    sc.close();
    }
}