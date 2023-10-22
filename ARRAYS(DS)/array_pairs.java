//Write a program to print all the possilbe pairs in an array
//total pairs=n(n-1)/2;
//In MAIN- array input,call function
//In FUNCTION int total pairs,tp++ count pairs
//1st loop 0,array.length store current =array[i];
//2nd oop i+1,array.length, print pairs

public class array_pairs {
    public static void pairs(int array[]){
        int tp=0;
        for(int i=0;i<array.length;i++){
            int curr=array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.println("("+curr+","+array[j]+")");
                tp++;
            }
            
        System.out.println();
        }
        System.out.println("Total number of pairs are : "+tp);
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5,6};
        pairs(array);
        
    }
}
