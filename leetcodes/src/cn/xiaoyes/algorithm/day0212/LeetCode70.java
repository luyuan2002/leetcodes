package cn.xiaoyes.algorithm.day0212;

public class LeetCode70 {
    public static void main(String[] args) {
        LeetCode70 code = new LeetCode70();
        int res = code.climbStairs(3);
        System.out.println(res);
    }

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
