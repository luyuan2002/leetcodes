package cn.xiaoyes.algorithm.day0213;

import java.util.Scanner;

public class LanQiao504 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        int[] a = new int[26];
        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i) - 'a']++;
        }

        char ch = 'a';
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (a[i] > max) {
                max = a[i];
                ch = (char) ('a' + i);
            }
        }
        System.out.println(ch);
        System.out.println(max);
    }
}
