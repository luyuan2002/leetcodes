package cn.xiaoyes.algorithm.day0214;

public class LeetCode64 {
    public static void main(String[] args) {
        LeetCode64 code = new LeetCode64();
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int res = code.minPathSum(grid);
        System.out.println(res);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                } else {
                    int top = i - 1 >= 0 ? dp[i - 1][j] + grid[i][j] : Integer.MAX_VALUE;
                    int left = j - 1 >= 0 ? dp[i][j - 1] + grid[i][j] : Integer.MAX_VALUE;
                    dp[i][j] = Math.min(top, left);
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
