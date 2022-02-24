package cn.xiaoyes.algorithm.day0224;

import java.util.HashMap;
import java.util.Map;

public class Offer39 {
    public static void main(String[] args) {
        Offer39 offer = new Offer39();
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int res = offer.majorityElement(arr);
        System.out.println(res);
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int res = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) > max) {
                res = key;
                max = map.get(key);
            }
        }
        return res;
    }

}
