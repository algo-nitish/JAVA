package Recursion;

public class CheckArrSort {

    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1){
            return true;
        }
        if(arr[1]> arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
      public static void main(String[] args) {
        // check if a given array is sorted or not
        //1,2,3,4,5
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
      }
}
