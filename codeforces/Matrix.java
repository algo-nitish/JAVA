import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int targetRow = 2, targetCol = 2; // Center position in 0-based index
        int oneRow = 0, oneCol = 0;

        // Reading the 5x5 matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int value = sc.nextInt();
                if (value == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }
        
        // Calculate moves using Manhattan Distance
        int moves = Math.abs(oneRow - targetRow) + Math.abs(oneCol - targetCol);
        
        System.out.println(moves);
        sc.close();
    }
}
