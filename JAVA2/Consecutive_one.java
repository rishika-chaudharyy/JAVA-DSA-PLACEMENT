//Write a program to print binary string without consecutive one
public class Consecutive_one {
    public static void print(int n , int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        print(n-1,0,str+"0");
        if(lastplace==0){
print(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
print(3,1,"");
    }
}


