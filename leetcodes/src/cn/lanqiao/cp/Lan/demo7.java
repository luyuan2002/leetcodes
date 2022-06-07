package cn.lanqiao.cp.Lan;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        System.out.println(f(Math.max(n, m), Math.min(n, m)));
    }

    public static long f(long n, long m) {
        if (m == 0) {
            return n;
        }
        return f(m, n % m);
    }
}
