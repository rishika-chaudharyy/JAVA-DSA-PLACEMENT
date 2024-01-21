//Write a program to print kth largest odd number
public class KOddNumber {
    public static void main(String args[]){
        int l=-3;
        int r=3;
        int k=1;
        int x;
        int ans;
        if(r%2==1){
            x=r;
        }else{
            x=r-1;
        }
        ans=x-2*(k-1);
        if(ans<l){
            System.out.println(0);

        }else{
        System.out.println(ans);
        }
    }
}
