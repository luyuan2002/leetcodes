package cn.xiaoyes.algorithm.day0301;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Arrays;

public class Offer21 {

    public static void main(String[] args) {
        Offer21 offer = new Offer21();
        int[] res = offer.exchange(Commons.productArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        System.out.println(Arrays.toString(res));
    }

    public int[] exchange(int[] nums) {
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                int t = nums[i];
                nums[i] = nums[cur];
                nums[cur++] = t;
            }
        }
        return nums;
    }
}
