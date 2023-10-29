//Write a program to print the sum of second row in a matrix
public class sum_secondrow {
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{0,0,0,0},{3,4,5,6}};
        int sum=0;
       
            for(int j=0;j<matrix[0].length;j++){
               sum+=matrix[1][j];
               }
               System.out.print("Sum is "+sum);
            }

        }
        
        


