package cn.xiaoyes.algorithm.day0307;

import java.util.Arrays;

/**
 * 题目链接: https://www.lanqiao.cn/problems/1443/learning/
 * @author BPDBSIR
 * 将数分解 然后逐个数字判断是否还有剩余的数字供使用 没有则输出当前数字 - 1 并且跳出方法
 */
public class LanQiao1443 {

    public static void main(String[] args) {
        int[] nums = new int[10];
        Arrays.fill(nums, 2021);
        int n = 1;
        while (n < 999999) {
            char[] array = String.valueOf(n).toCharArray();
            for (char c : array) {
                int v = Character.getNumericValue(c);
                if (nums[v] > 0) {
                    nums[v] -= 1;
                } else {
                	System.out.println(n - 1);
                    return;
                }
            }
            n++;
        }
        System.out.println("n = " + n);
    }

}
