//Write a program for N queens 
public class NQueens {
    public static void print(char board[][]) {
        System.out.println("-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Check if there is a queen in the same row to the left
        for (int i = row-1; i >=0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper diagonal on the left side
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (int i = row-1, j = col+1; j < board.length && i >= 0; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nqueen(char board[][], int row) {
        if (row == board.length) {
            print(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = 'x'; // Backtrack
            }
        }
    }
static int count=0;
    public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nqueen(board, 0);
        System.out.println("Total is "+count);
    }
}
