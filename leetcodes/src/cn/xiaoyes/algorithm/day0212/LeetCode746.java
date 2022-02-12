package cn.xiaoyes.algorithm.day0212;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Arrays;

public class LeetCode746 {
    public static void main(String[] args) {
        LeetCode746 code = new LeetCode746();
        int res = code.minCostClimbingStairs2(Commons.productArray(1, 100, 1, 1, 1, 100, 1, 1, 100, 1));
        System.out.println(res);
    }

    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        System.out.println(Arrays.toString(dp));
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }

    public int minCostClimbingStairs2(int[] cost) {
        int a = cost[0];
        int b = cost[1];
        int c = 0;
        for (int i = 2; i < cost.length; i++) {
            c = Math.min(a, b) + cost[i];
            a = b;
            b = c;
        }
        return Math.min(a,b);
    }
}
