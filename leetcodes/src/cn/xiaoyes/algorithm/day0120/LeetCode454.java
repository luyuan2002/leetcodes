package cn.xiaoyes.algorithm.day0120;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.HashMap;
import java.util.Map;

public class LeetCode454 {
    public static void main(String[] args) {
        System.out.println(fourSumCount(Commons.productArray(1, 2), Commons.productArray(-2, -1), Commons.productArray(-1, 2), Commons.productArray(0, 2)));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int temp = 0;
        for (int i : nums1) {
            for (int j : nums2) {
                temp = i + j;
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }
        }
        for (int i : nums3) {
            for (int j : nums4) {
                temp = i + j;
                if (map.containsKey(-temp)) {
                    res += map.get(-temp);
                }
            }
        }
        return res;
    }
}
