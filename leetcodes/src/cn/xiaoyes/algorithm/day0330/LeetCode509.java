package cn.xiaoyes.algorithm.day0330;

public class LeetCode509 {

    public static void main(String[] args) {
        LeetCode509 code = new LeetCode509();
        System.out.println(code.fib(3));
    }

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int[] dp = new int[30 + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int fib2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib2(n - 1) + fib2(n - 2);
    }
}
