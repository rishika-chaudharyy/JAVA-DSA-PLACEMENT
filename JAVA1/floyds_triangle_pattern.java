//pattern
public class floyds_triangle_pattern {
    public static void pattern(int n){
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}
