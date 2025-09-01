package DivideAndConquer;

public class QuickSort {

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quicksort(int arr[], int si, int ei) {
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr, si, ei); // get pivot index
        Quicksort(arr, si, pIdx - 1);      // sort left part
        Quicksort(arr, pIdx + 1, ei);      // sort right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];    // last element as pivot
        int i = si - 1;         // index for smaller element

        for(int j = si; j < ei; j++) {
            if(arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap pivot into correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1; // return pivot index
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        Quicksort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
