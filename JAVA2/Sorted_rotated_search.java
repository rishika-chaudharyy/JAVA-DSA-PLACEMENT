//Write a program to search in a rotated and sorted array
public class Sorted_rotated_search {
    public static int search(int arr[],int target,int si , int ei){
        if(si>ei){
            return -1;
        }
    int mid=si+(ei-si)/2;
    //case Found
    if(arr[mid]==target){
        return mid;
    }

   // mid on L1
   if(arr[si]<=arr[mid]){
    //case left
    if(arr[si]<=target && target<=arr[mid]){
      return  search(arr,target,si,mid-1);
    }
    //case right
    else{
        return search(arr,target,mid+1,ei);
    }
   }
   //mid on L2
   else{
    //case right
    if(arr[mid]<=target && target<=arr[ei]){
        return search(arr,target,mid+1,ei); 
    }else{
        //case left
        return search(arr,target,si,mid-1);
    }

   }
    }
    public static void main(String args[]){
    int arr[]={4,5,6,7,0,1,2};
    int target=6;//output=4
    int idx=search(arr,target,0,arr.length-1);
    System.out.print(idx);
    }
}
// public static int search(int arr[], int target, int si, int ei) {
//     while (si <= ei) {
//         int mid = si + (ei - si) / 2;

//         // case Found
//         if (arr[mid] == target) {
//             return mid;
//         }

//         // mid on L1
//         if (arr[si] <= arr[mid]) {
//             // case left
//             if (arr[si] <= target && target <= arr[mid]) {
//                 ei = mid - 1;
//             }
//             // case right
//             else {
//                 si = mid + 1;
//             }
//         }
//         // mid on L2
//         else {
//             // case right
//             if (arr[mid] <= target && target <= arr[ei]) {
//                 si = mid + 1;
//             } else {
//                 // case left
//                 ei = mid - 1;
//             }
//         }
//     }
//     return -1; // If the element is not found
// }
