package cn.xiaoyes.simple.simple01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long a = 100000000;
        long b = 200000000;
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        for (long i = num; i <= b; i++) {
            StringBuffer sb = new StringBuffer(i + "");
            long j = Long.parseLong(sb.reverse().toString());
            if (i * j >= a && i * j <= b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("F");
    }
}
