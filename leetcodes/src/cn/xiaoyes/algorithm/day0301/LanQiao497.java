package cn.xiaoyes.algorithm.day0301;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LanQiao497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            int n = sc.nextInt();
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
            sum += n;
        }
        avg = sum / size;
        System.out.println(max);
        System.out.println(min);
        System.out.println(new DecimalFormat("#.00").format(avg));
        sc.close();
    }
}
