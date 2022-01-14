package cn.xiaoyes.algorithm.day0114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1389.按既定顺序创建目标数组
 */
public class Simple05 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fn(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1})));
    }

    public static int[] fn(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] rew = new int[nums.length];
        for (int i = 0; i < rew.length; i++) {
            rew[i] = list.get(i);
        }
        return rew;
    }
}
