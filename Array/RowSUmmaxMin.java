package Array;
import java.util.*;
public class RowSUmmaxMin {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int max = arr[i][0];
            int min = arr[i][0];

            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
                if (arr[i][j] > max)
                    max = arr[i][j];
                if (arr[i][j] < min)
                    min = arr[i][j];
            }

            System.out.println("Row " + (i + 1) + ": Sum = " + sum + ", Max = " + max + ", Min = " + min);
        }
    }

}
