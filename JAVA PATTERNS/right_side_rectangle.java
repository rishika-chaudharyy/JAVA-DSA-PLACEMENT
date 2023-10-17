import java.util.*;
public class right_side_rectangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for rows");
        int n=sc.nextInt();
        
        System.out.println("Enter the number for columns");
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=m;k++){
                System.out.print("*");
            }
            System.out.println();
            sc.close();
        }
    }
}