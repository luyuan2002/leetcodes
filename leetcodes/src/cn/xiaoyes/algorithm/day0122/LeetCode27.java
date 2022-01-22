package cn.xiaoyes.algorithm.day0122;

import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode27 {
    public static void main(String[] args) {
        System.out.println(removeElement(Commons.productArray(3, 2, 2, 3), 3));
    }

    public static int removeElement(int[] nums, int val) {
        int n = 0;
        int i;
        for (i = 0; n < nums.length; n++) {
            if (nums[n] != val){
                nums[i] = nums[n];
                i++;
            }
        }
        return i;
    }
}
