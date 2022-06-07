package cn.lanqiao.start;

import java.util.Scanner;

/**
 * 求和
 */
public class Simple04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        long res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                res += nums[i] * nums[j];
            }
        }
        System.out.println(res);
    }
}
