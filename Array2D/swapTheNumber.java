package Array2D;

import java.util.Scanner;

public class swapTheNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < k; j++) {
                int temp = mat[i][m - j - 1];
                mat[i][m - j - 1] = mat[n - 1 - i][j];
                mat[n - 1 - i][j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//codechef question he ye ..Swap the number==>Basic Idea behind this question is that we have to swap the number in matrix and print the matrix after swapping the number in matrix 