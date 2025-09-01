package Recursion;

public class LastOccurElem {

    public static int LastOccurElem(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        // Recursive call
        int isFound = LastOccurElem(arr, key, i + 1);

        // If found in deeper call, return that index
        if (isFound != -1) {
            return isFound;
        }

        // Otherwise check current index
        if (arr[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println("Last occurrence of 5 is at index: " + LastOccurElem(arr, 5, 0));
    }
}

