//Write a function to check if a number is prime or not

public class function_prime {
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
    public static void main(String args[]){
    System.out.println(prime(5));
    }
}
