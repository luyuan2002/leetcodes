package cn.xiaoyes.algorithm.day0209;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * N皇后
 */
public class LeetCode51 {
    public static void main(String[] args) {
        LeetCode51 code = new LeetCode51();
        List<List<String>> res = code.solveNQueens(8);
        for (int i = 0; i < res.size(); i++) {
            System.out.println("第" + (i + 1) + "种摆法: ");
            List<String> e = res.get(i);
            for (int j = 0; j < e.size(); j++) {
                char[] array = e.get(j).toCharArray();
                for (int k = 0; k < array.length; k++) {
                    System.out.print(array[k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }

        /*char[][] mx = new char[8][8];
        for (char[] cs : mx) {
            Arrays.fill(cs,'*');
        }
        mx[0][0] = 'Q';
        mx[4][0] = 'Q';
        mx[5][0] = 'Q';
        for (int i = 0; i < mx.length; i++) {
            for (int j = 0; j < mx[i].length; j++) {
                System.out.print(mx[i][j] + "  ");
            }
            System.out.println();
        }
        *//* 列上是否成立 *//*
        for (int row = mx.length -1,col = 0; col < row; col++) {
            if (mx[col][row] == 'Q'){
                System.out.println("row => " + row + " col => " + col + " 不合法");
            }
        }*/
    }

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] matrix = new char[n][n];
        for (char[] rows : matrix) Arrays.fill(rows, '.');
        backtrack(n, 0, matrix);
        return res;
    }
    public void backtrack(int n, int row, char[][] matrix) {
        if (row == n) {
            List<String> ret = new ArrayList<>();
            for (char[] cols : matrix) {
                ret.add(String.copyValueOf(cols));
            }
            res.add(ret);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isValid(row, col, n, matrix)) {
                matrix[row][col] = 'Q';
                backtrack(n, row + 1, matrix);
                matrix[row][col] = '.';
            }
        }
    }
    public boolean isValid(int row, int col, int n, char[][] matrix) {
        /* 检查列 */
        for (int i = 0; i < row; i++) {
            if (matrix[i][col] == 'Q') {
                return false;
            }
        }
        /* 检查45度对角线 */
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }
        /* 检查135度对角线 */
        for (int i = row - 1, j = col + 1; i >= 0 && j <= n - 1; i--, j++) {
            if (matrix[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
