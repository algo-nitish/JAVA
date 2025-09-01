package BackTracking;
public class N2Queens {
    
//This code doesn't check whether placing a queen at a certain position is safe or not (i.e., it misses diagonal/column/row conflict checks), so it will print all combinations instead of valid N-Queens solutions.
      public static void nQueens(char[][] board, int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            board[row][j] = 'Q';                 // place queen
            nQueens(board, row + 1);             // recursive call
            board[row][j] = '.';                 // backtracking step
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("------Chess board------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        nQueens(board, 0);
    }
}
