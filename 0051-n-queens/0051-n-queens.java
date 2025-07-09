import java.util.*;

class Solution {

    public static boolean safetoplace(int col, int row, int mat[][]) {
        int n = mat.length;
        // Check same column
        for (int i = 0; i < row; i++) { // we only need to check rows before the current one
            if (mat[i][col] == 1)
                return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 1)
                return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (mat[i][j] == 1)
                return false;
        }

        return true;
    }

    public static void placequeens(int row, int[][] mat, List<List<String>> ans) {
        int n = mat.length;
        if (row == n) {
            // Found one valid configuration, convert it to List<String> and add to ans
            List<String> board = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1)
                        sb.append('Q');
                    else
                        sb.append('.');
                }
                board.add(sb.toString());
            }
            ans.add(board);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (safetoplace(i, row, mat)) {
                mat[row][i] = 1;
                placequeens(row + 1, mat, ans);
                mat[row][i] = 0; // backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] mat = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        placequeens(0, mat, ans);
        return ans;
    }
}
