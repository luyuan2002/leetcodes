package cn.xiaoyes.algorithm.day1229;

import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数字
 */
public class Simple136 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 1, 2};
        Simple136 simple = new Simple136();
        System.out.println(simple.singleNumber(arr));
        System.out.println(simple.test1(arr));
        System.out.println(simple.test2(arr));
    }

    /**
     * 哈希表求解
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    /**
     * 暴力破解
     *
     * @param nums
     * @return
     */
    public int test1(int[] nums) {
        for (int n : nums) {
            int count = 0;
            for (int m : nums) {
                if (n == m) {
                    count++;
                }
            }
            if (count == 1) {
                return n;
            }
        }
        return -1;
    }

    /**
     * 异或解法
     * @param nums
     * @return
     */
    public int test2(int[] nums){
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
