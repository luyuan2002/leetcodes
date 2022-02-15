package cn.xiaoyes.algorithm.day0215;

import java.util.List;

public class LeetCode120 {
    public static void main(String[] args) {

    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int res = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                int val = triangle.get(i).get(j);
                dp[i][j] = Integer.MAX_VALUE;
                if (j != 0) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + val);
                }
                if (j != i) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + val);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            res = Math.min(res, dp[n - 1][i]);
        }
        return res;
    }

    public int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0][0];
    }
}
