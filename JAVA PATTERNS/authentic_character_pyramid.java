import java.util.*;
public class authentic_character_pyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows");
        int n=sc.nextInt();
        int nsp=n-1;
        
        for(int i=1;i<=n;i++){
            int a=i-1;
              for(int j=1;j<=nsp;j++){
                System.out.print(" ");
              }
              nsp--;
              for(int k=1;k<=i;k++){
                char ch=(char)(k+64);
                System.out.print(ch);
              }
              for(int q=1;q<=i-1;q++){
                char ch=(char)(a+64);
                System.out.print(ch);
                a--;
              }
System.out.println();
        }


sc.close();

    }
}
