//Write a program to pair up friends
public class Friendspairing {
    public static int pairs(int n){
        if(n==1||n==2){
            return n;
        }
        return pairs(n-1)+(n-1)*pairs(n-2);
    }
    public static void main(String args[]){
System.out.println(pairs(3));
    }
}
