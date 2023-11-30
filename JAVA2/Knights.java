//Write a program for knights
import java.util.*;
public class Knights{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int c=sc.nextInt();

        int board[][]=new int[n][n];
        tour(board,r,c,1);
        print(board);
        sc.close();

    }
    public static void print(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length ; j++){
                System.out.print(board[i][j]+"");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void tour(int board[][],int r , int c,int move){
    
        if(r<0 || c<0 || r>=board.length || c>=board.length || board[r][c]>0){
            return;
        }else if(move==board.length*board.length){
            board[r][c]=move;
            print(board);
            board[r][c]=0;
            return;


        }


        board[r][c]=move;
        tour(board,r-2,c+1,move+1);
        tour(board,r-1,c+2,move+1);
        tour(board,r+1,c+2,move+1);
        tour(board,r+2,c+1,move+1);
        tour(board,r+2,c-1,move+1);
        tour(board,r-1,c-2,move+1);
        tour(board,r-2,c-1,move+1);
        board[r][c]=0;



    }
}