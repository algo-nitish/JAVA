package Array;

public class Transpose90degreechange {
    public static void main(String[] args) {
        int arr[][] = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int n = arr.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
           for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        reverseRows(arr);

        // Print rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //  Reverse each row
    private static void reverseRows(int arr[][]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}
