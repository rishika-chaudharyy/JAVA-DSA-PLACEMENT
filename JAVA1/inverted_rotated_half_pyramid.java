
public class inverted_rotated_half_pyramid {
    public static void pattern(int n,int m){
        int nst=1;
        int nsp=n-1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){
                System.out.print("*");
            }
            nst++;
            nsp--;
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(10,10);
    }
}
