//Write a program to fit the tiles
public class Tiling_problem{
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vert=tiling(n-1);
        int hor=tiling(n-2);
        return vert+hor;
    }
    public static void main(String args[]){
    System.out.println(tiling(3));
    }
}
