package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 2, 5, 8, 90, 12 };
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i ;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swapValue(arr, i, min);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapValue(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return;
    }
}
