package cn.xiaoyes.algorithm.day0117;

import java.util.Arrays;

public class LeetCode977 {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
        System.out.println(Arrays.toString(sortedSquares2(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            res[i] = cur * cur;
        }
        Arrays.sort(res);
        return res;
    }

    public static int[] sortedSquares2(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int index = right;
        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];
            if (l > r) {
                res[index--] = l;
                left++;
            } else {
                res[index--] = r;
                right--;
            }
        }
        return res;
    }
}
