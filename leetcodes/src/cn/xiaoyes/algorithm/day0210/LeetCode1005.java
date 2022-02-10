package cn.xiaoyes.algorithm.day0210;

import java.util.Arrays;

public class LeetCode1005 {
    public static void main(String[] args) {
        LeetCode1005 code = new LeetCode1005();
        int[] arr = {3,-1,0,2};
        int k = 2;
        int r = code.largestSumAfterKNegations(arr, k);
        System.out.println(r);
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        int[] res = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(res);
        for (int i = 0; i < k; i++) {
            res[i] = -res[i];
            if (res[i] == 0) {
                i--;
            }
        }
        int sum = 0;
        for (int r : res) sum += r;
        return sum;
    }
}
