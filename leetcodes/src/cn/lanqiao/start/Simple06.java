package cn.lanqiao.start;

import java.util.Scanner;

/**
 * 选数异或
 */
public class Simple06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        String[] res = new String[m];
        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            boolean f = false;
            for (int j = start; j <= end; j++) {
                for (int k = j; k <= end; k++) {
                    if ((j ^ k) == x) {
                        f = true;
                        break;
                    }
                }
            }
            if (f) {
                res[i] = "yes";
            } else {
                res[i] = "no";
            }
        }
        sc.close();
        for (String re : res) {
            System.out.println(re);
        }
    }
}
