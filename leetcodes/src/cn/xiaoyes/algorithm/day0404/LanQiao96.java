package cn.xiaoyes.algorithm.day0404;

import java.util.Scanner;

public class LanQiao96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        StringBuilder builder = new StringBuilder();
        while (n > 0){
            builder.append((char) ('A' + ((--n) % 26)));
            n /= 26;
        }
        System.out.println(builder.reverse());
    }
}
