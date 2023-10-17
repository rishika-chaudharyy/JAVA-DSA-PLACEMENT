//1
// 1 3
// 1 3 5
// 1 3 5 7

// import java.util.*;
// public class odd_number_triangle {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             int a=1;
//             for(int j=1;j<=i;j++){
//                 System.out.print(a+" ");
//                a=a+2;
//             }
//             System.out.println();
//         }
// sc.close();
//     }
// }




// 1 
// 3 5
// 7 9 11
// 13 15 17 19
import java.util.*;
public class odd_number_triangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
               a=a+2;
            }
            System.out.println();
        }
sc.close();
    }
}
