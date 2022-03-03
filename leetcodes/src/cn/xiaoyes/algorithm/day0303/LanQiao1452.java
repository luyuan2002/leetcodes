package cn.xiaoyes.algorithm.day0303;

import java.util.Scanner;

public class LanQiao1452 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long time = sc.nextLong();
        long a = time / 1000;
        long b = a % 60;
        long c = a / 60;
        long d = c % 60;
        long e = c / 60;
        long f = e % 24;
        String date = String.format("%02d", f) + ":" + String.format("%02d", d) + ":" + String.format("%02d", b);
        System.out.println(date);
    }
}
