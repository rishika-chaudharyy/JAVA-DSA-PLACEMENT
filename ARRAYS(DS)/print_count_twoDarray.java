//Write a program to print the number if 7's in an array
public class print_count_twoDarray {
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{1,2,4,5},{3,4,5,6}};
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==7){
                count++;
               }
            }
        }
        System.out.print("Count is "+count);
    }
}
