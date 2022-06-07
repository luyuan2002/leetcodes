package cn.lanqiao.start;

import java.util.Scanner;

/**
 * GCD
 */
public class Simple07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(f(Math.max(n, m), Math.min(n, m)));
    }

    public static int f(int n, int m) {
        if (m == 0) {
            return n;
        }
        return f(m, n % m);
    }
}
