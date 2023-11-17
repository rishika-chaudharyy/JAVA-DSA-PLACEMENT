//Write a program to find the first as well as last occurece of a element in java
public class Recursion_firstlast_occurence {
    public static int first(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,key,i+1);
    }
    public static int last(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=last(arr,key,i+1);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[]={8,4,6,4,5,7,9,0,5,4,3};
    System.out.println(first(arr,5,0));
    System.out.println(last(arr,5,0));
    }
}
