//Write a program to use assignment opertaors

public class assignment_operators {
    public static void main(String args[]) {
        int a=8;
        int b=49;
        System.out.println((a+=b));  //Same as a=a+b but it executes much faster
        System.out.println((a-=b));
        System.out.println((a*=b));
        System.out.println((a/=b));
        System.out.println((a%=b));
        
    }
    
}
