package cn.xiaoyes.algorithm.day0301;

import java.util.Scanner;

public class LanQiao592 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 2020;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            char[] array = String.valueOf(i).toCharArray();
            for (char c : array) {
                if (c == '2'){
                    sum++;
                }
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
