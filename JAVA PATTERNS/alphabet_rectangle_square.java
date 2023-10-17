// A 
// A B
// A B C
// A B C D
// import java.util.*;
// public class alphabet_rectangle_square {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             int a=1;
//             for(int j=1;j<=i;j++){
//                int d=a+64;
//                 char ch=(char)d;
//                 System.out.print(ch+" ");
//                a++;
//             }
//             System.out.println();
//         }
// sc.close();
//     }
// }


// A
// B C
// D E F
// G H I J
import java.util.*;
public class alphabet_rectangle_square {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
               int d=a+64;
                char ch=(char)d;
                System.out.print(ch+" ");
               a++;
            }
            System.out.println();
        }
sc.close();
    }
}
