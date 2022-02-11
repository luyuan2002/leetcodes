package cn.xiaoyes.algorithm.day0211;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LeetCode1005 {
    public static void main(String[] args) {
        LeetCode1005 code = new LeetCode1005();
        int[] arr = {2, -3, -1, 5, -4};
        int k = 2;
        int res = code.largestSumAfterKNegations(arr, k);
        System.out.println(res);
    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums).boxed().sorted((a,b) -> Math.abs(b) - Math.abs(a)).mapToInt(v -> v).toArray();
        System.out.println(Arrays.toString(nums));
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0 && k > 0) {
                nums[i] = -nums[i];
                k--;
            }
        }
        if (k % 2 == 1) nums[len - 1] = -nums[len - 1];
        return Arrays.stream(nums).sum();
    }
}
