//Write a program to print the substring that ends and starts with the same character
public class Recursion_substring {
    public static int count(String str,int i, int j, int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res=count(str,i+1,j,n-1)+count(str,i,j-1,n-1)-count(str,i+1,j-1,n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String args[]){
        String str="abcab";
        int n=str.length();
System.out.println(count(str,0,n-1,n));
    }
}
