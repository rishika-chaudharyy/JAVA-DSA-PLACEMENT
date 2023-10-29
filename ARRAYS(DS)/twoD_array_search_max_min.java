//Write a program to create an 2D array and three functions to create a key and search for largest and smallest element
import java.util.*;
public class twoD_array_search_max_min {
    public static boolean key(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at index ( "+i+" "+j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
    return false;
    }
    public static void largest(int matrix[][]){
        int max=Integer.MIN_VALUE;
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]>max){
                max=matrix[i][j];
              }  
            
          }
          
        }   
        System.out.println("The maximum is : "+max);
        }
        public static void smallest(int matrix[][]){
        int min=Integer.MAX_VALUE;
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]<min){
                min=matrix[i][j];
              }  
            
          }
          
        }   
        System.out.println("The minimum is : "+min);
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=4;
        int m=3;
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        key(matrix,88);
        largest(matrix);
        smallest(matrix);
        sc.close();
    }
}
