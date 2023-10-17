import java.util.*;
public class character_pyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                int d=a+96;
                char ch=(char)d;

                System.out.print(ch+" ");
                a++;
            }
            
            System.out.println();
        }
        sc.close();
    }
}