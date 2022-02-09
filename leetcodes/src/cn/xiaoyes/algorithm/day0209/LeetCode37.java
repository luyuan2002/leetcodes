package cn.xiaoyes.algorithm.day0209;

public class LeetCode37 {
    public static void main(String[] args) {

    }

    public void solveSudoku(char[][] board) {
        backtrack(0, 0, board);
    }

    public boolean backtrack(int i, int j, char[][] board) {
        int m = 9, n = 9;
        if (j == n) {
            return backtrack(i + 1, 0, board);
        }
        if (i == m){
            return true;
        }
        if (board[i][j] != '.') {
            return backtrack(i, j + 1, board);
        }
        for (char c = '1'; c <= '9'; c++) {
            if (!isValid(i, j, c, board)) {
                continue;
            }
            board[i][j] = c;
            if (backtrack(i, j + 1, board)) {
                return true;
            }
            board[i][j] = '.';
        }
        return false;
    }

    public boolean isValid(int r, int c, char n, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == n) return false;
            if (board[i][c] == n) return false;
            if (board[(r / 3) * 3 + i / 3][(c / 3) * 3 + i % 3] == n)
                return false;
        }
        return true;
    }
}
