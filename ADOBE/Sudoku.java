public class Sudoku {
    public static boolean issafe(int sudoku[][], int row, int col, int digit) {
        // Check in the same row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // Check in the same column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check in the same 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudokusolve(int sudoku[][], int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextrow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (sudoku[row][col] != 0) {
            return sudokusolve(sudoku, nextrow, nextcol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokusolve(sudoku, nextrow, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void print(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isValidSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int digit = sudoku[i][j];
                if (digit != 0 && !issafe(sudoku, i, j, digit)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0}, {4, 9, 0, 1, 5, 7, 0, 0, 2}, {0, 0, 3, 0, 0, 4, 1, 9, 0},
                {1, 8, 5, 0, 6, 0, 0, 2, 0}, {0, 0, 0, 0, 2, 0, 0, 6, 0}, {9, 6, 0, 4, 0, 5, 3, 0, 0},
                {0, 3, 0, 0, 7, 2, 0, 0, 4}, {0, 4, 9, 0, 3, 0, 0, 5, 7}, {8, 2, 7, 0, 0, 9, 0, 1, 3}};

        if (isValidSudoku(sudoku)) {
            System.out.println("Given Sudoku is valid");
        } else {
            System.out.println("Given Sudoku is not valid");
        }

        if (sudokusolve(sudoku, 0, 0)) {
            System.out.println("Solution exists");
            print(sudoku);
        } else {
            System.out.println("Solution does not exist");
        }
    }
}
