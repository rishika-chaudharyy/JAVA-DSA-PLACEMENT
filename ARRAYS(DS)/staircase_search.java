//Write a program to search for elements in sorted matrix using staircase search
public class staircase_search {
    public static boolean staircase(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.print("Key found at index ("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("Key not found");
        return false;
    }
    public static void main(String args[]){
         int matrix[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int key=22;
        staircase(matrix,key);
    }
}
