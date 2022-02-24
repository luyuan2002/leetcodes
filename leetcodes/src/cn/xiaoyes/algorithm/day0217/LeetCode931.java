package cn.xiaoyes.algorithm.day0217;

import java.util.Arrays;

public class LeetCode931 {
    public static void main(String[] args) {
        LeetCode931 code = new LeetCode931();
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int res = code.minFallingPathSum2(matrix);
    }

    int MAX = Integer.MAX_VALUE;

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int res = MAX;
        for (int i = 0; i < n; i++) {
            res = Math.min(res, find(matrix, i));
        }
        return res;
    }


    public int find(int[][] matrix, int u) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = i == u ? matrix[0][i] : MAX;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = MAX;
                int val = matrix[i][j];
                if (dp[i - 1][j] != MAX) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + val);
                }
                if (j - 1 >= 0 && dp[i - 1][j - 1] != MAX) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + val);
                }
                if (j + 1 < n && dp[i - 1][j + 1] != MAX) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j + 1] + val);
                }

            }
        }
        int res = MAX;
        for (int i = 0; i < n; i++) {
            res = Math.min(res, dp[n - 1][i]);
        }
        for (int[] ress : dp) {
            System.out.println(Arrays.toString(ress));
        }
        return res;
    }

    public int minFallingPathSum2(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        // 将matrix的第一行赋值给dp
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 获取当前的需要累加的值
                int val = matrix[i][j];
                // 将dp当前值赋值为上一行当前列 + val
                dp[i][j] = dp[i - 1][j] + val;
                // i >= 1
                if (j - 1 >= 0) {
                    // 上一行的前一列 + val
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + val);
                }
                // j + 1 < n
                if (j + 1 < n) {
                    // 上一行的下一列 + val
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j + 1] + val);
                }
            }
        }
        int res = Integer.MAX_VALUE;
        // 遍历找出最后一行的最小值
        for (int i = 0; i < n; i++) {
            res = Math.min(res, dp[n - 1][i]);
        }
        return res;
    }
}
