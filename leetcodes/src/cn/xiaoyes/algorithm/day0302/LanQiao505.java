package cn.xiaoyes.algorithm.day0302;

import java.util.Scanner;

public class LanQiao505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][n];
        int[][] f = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        sc.close();
        f[0][0] = nums[0][0];
        for (int i = 1; i < n; i++) {
            f[i][0] = f[i - 1][0] + nums[i][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                f[i][j] = nums[i][j] + Math.max(f[i - 1][j], f[i - 1][j - 1]);
            }
        }
        if (n % 2 != 0) {
            System.out.println(f[n - 1][n / 2]);
        } else {
            System.out.println(Math.max(f[n - 1][n / 2], f[n - 1][n / 2 - 1]));
        }
    }

}
