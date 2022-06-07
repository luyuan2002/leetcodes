package cn.lanqiao.start;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 青蛙过河
 */
public class Simple08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 河的宽度
        int n = sc.nextInt();
        // 天数(2x为实际过河的次数)
        int x = sc.nextInt();
        int[] nums = new int[n - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        sc.close();
    }
}
