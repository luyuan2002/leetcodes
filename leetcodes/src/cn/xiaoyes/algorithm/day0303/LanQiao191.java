package cn.xiaoyes.algorithm.day0303;

import java.util.Scanner;

public class LanQiao191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.contains("2") || s.contains("0") || s.contains("1") || s.contains("9")) {
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
