//Write a program to sort an array using merge sort
// public class Merge_sort {
//     public static void print(int arr[]){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void mergesort(int arr[],int si, int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid=si+(ei-si)/2;//(si+ei)/2
//         mergesort(arr,0,mid);//left part
//         mergesort(arr,mid+1,ei);//right part
//         merge(arr,si,mid,ei);
//     }
//     public static void merge(int arr[],int si, int mid, int ei){
//         int temp[]=new int[ei-si+1];
//         int i=si;//iterator for left part
//         int j=mid+1;//iterator for right part
//         int k=0;//iterator for temporary array

//         while(i<=mid && j<=ei){
//             if(arr[i]<arr[j]){
//                 temp[k]=arr[i];
//                 i++;
//             }else{
//                 temp[k]=arr[j];
//                 j++;
//             }
//             k++;
//         }
//         while(i<=mid){ //bache hue left k elements
//             temp[k++]=arr[i++];
//         }
//         while(j<=ei){ //bache hue right k elements
//             temp[k++]=arr[j++];
//         }
//         //copy temp to original array
//         for(k=0,i=si;k<temp.length;k++,i++){
//             arr[i]=temp[k];
//         }

//     }
//     public static void main(String args[]){
//         int arr[]={6,3,9,5,2,8,-1,-2,4};
//         mergesort(arr,0,arr.length-1);
//         print(arr);
//     }
// }

public class Merge_sort{
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergesort(arr,0,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
      while(i<=mid){
        temp[k++]=arr[i++];
      }
      while(j<=ei){
        temp[k++]=arr[j++];
      }
      for(k=0,i=si;k<temp.length;k++,i++){
       arr[i]=temp[k];
      }
    }
    public static void main(String args[]){
        int arr[]={3,4,5,7,2,3,1};
    mergesort(arr,0,arr.length-1);
    print(arr);
    }
}