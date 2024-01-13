// Given an n x n 2D matrix representing an image , rotate the image by 90 degrees cloclwise
public class RotateImageMatrix {
    public void rotate(int board[][]) {
        int row = board.length, col = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                int dummy = board[i][j];
                board[i][j] = board[j][i];
                board[j][i] = dummy;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                int dummy = board[i][col - 1 - j];
                board[i][col - 1 - j] = board[i][j];
                board[i][j] = dummy;
            }
        }
    }

    public static void main(String args[]) {
        RotateImageMatrix matrixRotator = new RotateImageMatrix();

        int board[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
        matrixRotator.rotate(board);

        // Print the rotated matrix
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
