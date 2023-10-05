//Write a function for calculating binomial coefficient

public class function_binomial_coefficient {
    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static int bincoeff(int n,int r){
        int x=factorial(n);
        int y=factorial(r);
        int z=factorial(n-r);
         
       int coeff=x/(y*z);
       return coeff;
    }
    public static void main(String args[]){
    System.out.println("Binomial coefficient is" +bincoeff(5,2));
    }
}
