package cn.xiaoyes.algorithm.day0221;

public class LeetCode1289 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int res = minFallingPathSum(arr);
        System.out.println(res);
    }

    public static int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) dp[0][i] = grid[0][i];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                int val = grid[i][j];
                for (int p = 0; p < n; p++) {
                    if (j != p) {
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][p] + val);
                    }
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.min(res, dp[n - 1][i]);
        }
        return res;
    }
}
