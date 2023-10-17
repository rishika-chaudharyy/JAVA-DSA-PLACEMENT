import java.util.*;
public class inverted_right_side_triangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int n=sc.nextInt();
        int nst=n;
        int nsp=0;
for(int i=1;i<=n;i++){
    for(int j=1;j<=nsp;j++){
        System.out.print(" ");
    }
for(int j=1;j<=nst;j++){
    System.out.print("*");
}
nst--;
nsp++;
System.out.println();
}
  sc.close();  

    }
}