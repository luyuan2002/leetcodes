package cn.xiaoyes.algorithm.day0211;

import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode134 {
    public static void main(String[] args) {
        LeetCode134 code = new LeetCode134();
        int res = code.canCompleteCircuit3(Commons.productArray(1, 2, 3, 4, 5), Commons.productArray(3, 4, 5, 1, 2));
        System.out.println(res);
    }

    /**
     * 暴力破解
     *
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        // 考虑从第一个点开始出发
        for (int i = 0; i < n; i++) {
            int j = i;
            int remain = gas[i];
            // 当前剩余油是否能达到下一个站
            while (remain - cost[i] >= 0){
                // 减去花费的加上新的点补给
                remain = remain - cost[j] + gas[j + 1 % n];
                j = (j + 1) % n;
                // j回到了i
                if (j == i){
                    return i;
                }
            }
        }
        // 任何点都不可以
        return -1;
    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int curSum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < gas.length; i++) {
            int rest = gas[i] - cost[i];
            curSum += rest;
            if (curSum < min) {
                min = curSum;
            }
        }
        if (curSum < 0) return -1;
        if (min >= 0) return 0;
        for (int i = gas.length - 1; i > 0; i--) {
            int rest = gas[i] - cost[i];
            min += rest;
            if (min >= 0) {
                return i;
            }
        }
        return -1;
    }


    public int canCompleteCircuit3(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum < 0) {
                index = (i + 1) % gas.length ;
                curSum = 0;
            }
        }
        if (totalSum < 0) return -1;
        return index;
    }
}
