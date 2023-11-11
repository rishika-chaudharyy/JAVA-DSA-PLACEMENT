//Write a program to get the ith bit
public class get_set_bit {
    public static int getbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int clearbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }
    public static int updatebit(int n, int i,int newbit) {
        // if(newbit==0){
        //   return  clearbit(n,i);
        // }else{
        //     return setbit(n,i);
        // }
        n=clearbit(n,i);
        int bitmask=newbit<<i;
        return n | bitmask;
    }
    public static int clearlastbit(int n, int i) {
        int bitmask = ((~0) << i);
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(getbit(4, 2));
        System.out.println(setbit(4, 2));
        System.out.println(setbit(4, 2));
        System.out.println(updatebit(10,2,1));
        System.out.println(clearlastbit(15,2));
        
    }
}
