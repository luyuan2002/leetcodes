package cn.lanqiao.simple;

import java.util.Scanner;

/**
 * 最少砝码
 */
public class Simple05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int n = 1;
        int ans = 1;
        int w = 1;
        while (n < N) {
            w *= 3;
            ans++;
            n += w;
        }
        System.out.println(ans);
    }

}
