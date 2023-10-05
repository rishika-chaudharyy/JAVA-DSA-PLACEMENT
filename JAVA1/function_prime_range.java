//Write a function to print all the prime numbers in a range

public class function_prime_range {
    public static boolean prime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
return true;
    }
    public static void primeinrange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
            System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
    primeinrange(17);
    }
}
