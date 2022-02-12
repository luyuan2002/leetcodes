package cn.xiaoyes.algorithm.day0212;

import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode714 {
    public static void main(String[] args) {
        LeetCode714 code = new LeetCode714();
        int res = code.maxProfit(Commons.productArray(1, 3, 2, 8, 4, 9), 2);
        System.out.println(res);
    }

    /**
     * 贪心算法
     *
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit(int[] prices, int fee) {
        int buy = prices[0] + fee;
        int sum = 0;
        for (int price : prices) {
            if (price + fee < buy) {
                buy = price + fee;
            } else if (price > buy) {
                sum += price - buy;
                buy = price;
            }
        }
        return sum;
    }

    /**
     * 动态规划
     *
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit2(int[] prices, int fee) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i] - fee);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }
        return dp[prices.length - 1][0];
    }
}
