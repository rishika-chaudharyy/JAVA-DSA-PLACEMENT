//Write a program for fast exponentiation and modular exponentiation
public class bit_fast_exponentiation {
    public static int fastexpo(int a , int n){
        int ans=1;
        while(n>0){
            
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static int modularexpo(int a , int n , int m){
        int ans=1;
        while(n>0){
            
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans%m;
    }
    public static void main(String args[]){
    System.out.println(fastexpo(3,5));
    System.out.println(modularexpo(5,3,13));
    }
}
