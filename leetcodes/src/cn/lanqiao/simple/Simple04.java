package cn.lanqiao.simple;

import java.util.Arrays;

/**
 * 卡片
 */
public class Simple04 {
    public static void main(String[] args) {
        f1();
        f2();
    }

    /**
     * 数值运算暴力解法
     */
    private static void f2() {
        int[] nums = new int[10];
        int res = -1;
        Arrays.fill(nums, 2021);
        for (int i = 0; i < 1000; i++) {
            int tmp = i;
            if (tmp == 0) {
                nums[0]--;
            } else {
                while (tmp != 0) {
                    if (nums[tmp % 10] < 0) {
                        System.out.println(res - 1);
                        System.exit(0);
                    }
                    nums[tmp % 10]--;
                    tmp /= 10;
                }
            }
            res = i;
        }
    }

    /**
     * 字符串拆分暴力解法
     */
    private static void f1() {
        int[] ns = new int[10];
        Arrays.fill(ns, 2021);
        int n = 1;
        while (true) {
            String s = String.valueOf(n);
            char[] cs = s.toCharArray();
            for (int i = 0; i < cs.length; i++) {
                int k = (int) cs[i] - 48;
                ns[k] = ns[k] - 1;
            }
            boolean f = false;
            for (int i = 0; i < cs.length; i++) {
                if (ns[i] == 0) {
                    f = true;
                    break;
                }
            }
            if (f) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
