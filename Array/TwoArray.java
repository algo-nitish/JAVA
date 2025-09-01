package Array;

import java.util.Scanner;

public class TwoArray {
    private int[][] array = new int[3][4];
    private static final int ROWS = 3;
    private static final int COLS = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoArray obj = new TwoArray();

        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                obj.array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The entered 2D array is:");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(obj.array[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
