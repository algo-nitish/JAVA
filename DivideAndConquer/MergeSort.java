package DivideAndConquer;

public class MergeSort {
    
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Mergesort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = (si + ei) / 2;
        Mergesort(arr, si, mid);       // left part
        Mergesort(arr, mid + 1, ei);    // right part
        Merge(arr, si, mid, ei);        // *** Merge sorted parts ***
    }

    public static void Merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;       // starting index of left part
        int j = mid + 1;  // starting index of right part
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // left part remaining
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // right part remaining
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // copy to original array
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        Mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
