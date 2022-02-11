package cn.xiaoyes.algorithm.day0211;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Arrays;

public class LeetCode135 {
    public static void main(String[] args) {
        LeetCode135 code = new LeetCode135();
        int res = code.candy(Commons.productArray(1, 2, 3, 4, 5));
        System.out.println(res);
    }

    public int candy(int[] ratings) {
        int len = ratings.length;
        int res = 1;
        if (ratings[1] > ratings[0]) {
            res++;
        }
        for (int i = 1; i < ratings.length - 1; i++) {
            res++;
            if (ratings[i - 1] > ratings[i]) {
                res++;
            }
            if (ratings[i + 1] > ratings[i]) {
                res++;
            }
        }
        res++;
        if (ratings[len - 1] > ratings[len - 2]) {
            res++;
        }
        return res;
    }

    public int candy2(int[] ratings) {
        int[] left = new int[ratings.length];
        int[] right = new int[ratings.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) left[i] = left[i - 1] + 1;
        }
        int count = left[ratings.length - 1];
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) right[i] = right[i + 1] + 1;
            count += Math.max(left[i], right[i]);
        }
        return count;
    }
}
