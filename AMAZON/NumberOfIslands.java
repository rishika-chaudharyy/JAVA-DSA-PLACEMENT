//Given a binary 2d matrix , find the number of islands
//A group of connected 1s form an Island .An island is surrounded by water and is formed by
//connecting adjacent lands horizontally or vertically . You may assume that all four
//edges of the grids are surrounded by water.


public class NumberOfIslands {
    public static void dfs(int grid[][], int i , int j , int row , int col){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]!=1){
            return;
        }
        if(grid[i][j]==1){
            grid[i][j]=0;
            dfs(grid,i,j-1,row,col);//left
            dfs(grid,i,j+1,row,col);//right
            dfs(grid,i-1,j,row,col);//up
            dfs(grid,i+1,j,row,col);//left
        }

    }
    public static int island(int grid[][]){
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    count++;
                    dfs(grid,i,j,row,col);
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int grid[][]={{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        System.out.println("The output is "+ island(grid));
    }
}
