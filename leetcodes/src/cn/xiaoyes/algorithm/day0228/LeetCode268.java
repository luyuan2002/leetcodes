package cn.xiaoyes.algorithm.day0228;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Arrays;

public class LeetCode268 {
    public static void main(String[] args) {
        LeetCode268 code = new LeetCode268();
        System.out.println(code.missingNumber(Commons.productArray(9, 6, 4, 2, 3, 5, 7, 0, 1)));
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) return i;
        }
        return n;
    }
}
