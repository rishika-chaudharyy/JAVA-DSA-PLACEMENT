import java.util.*;
public class general_number_square_rectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,m;
        System.out.println("Enter the number of rows and columns");
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            sc.close();
        }
    }

}
