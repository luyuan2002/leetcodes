package cn.xiaoyes.algorithm.day0120;

import java.util.*;
import java.util.stream.Collectors;

public class LeetCode349 {
    public static void main(String[] args) {
        int[] num1 = {4, 9, 5};
        int[] num2 = {9, 4, 9, 8, 4};
        /*System.out.println(Arrays.toString(intersection(num1, num2)));*/
        System.out.println(Arrays.toString(intersection2(num1, num2)));
        System.out.println(Arrays.toString(intersection3(num1,num2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int val : nums1) {
            set1.add(val);
        }
        for (int val : nums2) {
            if (set1.contains(val)) {
                set2.add(val);
            }
        }
        Set<Integer> collect = set2.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toCollection(LinkedHashSet::new));
        int[] res = new int[collect.size()];
        int index = 0;
        for (Integer val : collect) {
            res[index++] = val;
        }
        return res;
    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length, len2 = nums2.length;
        int[] res = new int[len1 + len2];
        int index = 0, index1 = 0, index2 = 0;
        while (index1 < len1 && index2 < len2) {
            int num1 = nums1[index1], num2 = nums2[index2];
            if (num1 == num2) {
                if (index == 0 || num1 != res[index - 1]) {
                    res[index++] = num1;
                }
                index1++;
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                index2++;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }

    public static int[] intersection3(int[] nums1, int[] nums2) {
        Map<Integer,Boolean> map = new HashMap<>();
        for (int val : nums1) {
            map.put(val,true);
        }
        int[] res = new int[map.size()];
        int index = 0;
        for (int val : nums2) {
            Boolean flag = map.get(val);
            if (flag != null && flag){
                res[index++] = val;
                map.put(val,false);
            }
        }
        return Arrays.copyOfRange(res,0,index);
    }
}
