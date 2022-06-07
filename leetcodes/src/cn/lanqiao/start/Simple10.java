package cn.lanqiao.start;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 最长不下降子序列
 * 最长递增子序列
 */
public class Simple10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        // 修改值
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            /*for (int j = i; j < j + k; j++) {
                int x = lengthOfLIS(Arrays.copyOfRange(nums, i, j));
                System.out.println(x);
            }*/
        }
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < dp.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
