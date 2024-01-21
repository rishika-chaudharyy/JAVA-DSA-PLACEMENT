//Write a program for maximum balanced string
public class MaximumBalancedString {
    public static void main(String args[]){
        String str="LRRRRLLRLLRL";
        int n=12;
        int l=0,r=0;
        int ans=0;
        for(int i=0;i<n ; i++){
            if(str.charAt(i)=='L'){
                l++;
            }else{
                r++;
            }
            if(l==r){
                ans++;
                l=0;
                r=0;
            }
        }
        System.out.println(ans);
    }
}
