//Get ith bit
public class bit_operations {
    public static int getbit(int n , int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    //Set ith bit
    public static int setbit(int n , int i){
        int bitmask=1<<i;
        return n|bitmask;

    }
    //Clear ith bit
    public static int clearbit(int n , int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    //Update ith bit
    public static int updatebit(int n , int i , int newbit){
        // if(newbit==1){
        //     return setbit(n , i);
        // }else{
        //     return clearbit(n , i);
        // }
        n = clearbit(n, i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    //Clear last ith bit
    public static int clearlastbit(int n , int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    //Clear range of bits
    public static int clearrangebit(int n , int i , int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        return n &(a|b);

    }
    public static void main(String args[]){
    System.out.println(getbit(5,1));
    System.out.println(setbit(10,2));
    System.out.println(clearbit(10,1));
    System.out.println(updatebit(10,2,1));
    System.out.println(clearlastbit(15,2));
    System.out.println(clearrangebit(10,2,4));
    }
}
