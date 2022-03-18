package cn.xiaoyes.algorithm.day0318;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 局部最优 推导全局最优
 */
public class LanQiao545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(nums);
        int sum = 0;
        int money = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                money = nums[i] + nums[i + 1];
            } else {
                money += nums[i + 1];
            }
            sum += money;
        }
        System.out.println(sum);
    }
}
