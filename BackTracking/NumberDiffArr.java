package BackTracking;

public class NumberDiffArr {

    public static void println(int arr[]) {
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Diffnumber(int arr[], int i , int val) {
        // base case
        if(i == arr.length){
            println(arr); // prints 1 2 3 4 5
            return;
        }

        // recursion
        arr[i] = val;
        Diffnumber(arr, i + 1, val + 1);

        // backtracking step - subtract 2 from each after returning
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Diffnumber(arr, 0, 1);
        println(arr); // prints -1 0 1 2 3
    }
}
