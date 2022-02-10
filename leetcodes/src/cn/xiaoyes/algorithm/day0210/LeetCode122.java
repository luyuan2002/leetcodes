package cn.xiaoyes.algorithm.day0210;

public class LeetCode122 {
    public static void main(String[] args) {

    }

    /**
     * 贪心算法
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res += Math.max(prices[i] - prices[i - 1], 0);
        }
        return res;
    }
}
