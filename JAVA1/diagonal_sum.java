//Write a program to print the sum of diagonal elements
public class diagonal_sum {
    public static void main(String rags[]){
        int matrix[][]={{1,2,3},
                        {5,6,7},
                        {9,10,11}};
                        
                        int sum=0;
    for(int i=0;i<matrix.length;i++){
       sum+=matrix[i][i];
       if(i!=matrix.length-i-1){
        sum+=matrix[i][matrix.length-i-1];
       }
   
    }
    System.out.println("The sum is "+sum);

    }
}
