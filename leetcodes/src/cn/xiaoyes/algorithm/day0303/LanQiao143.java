package cn.xiaoyes.algorithm.day0303;

import java.util.Scanner;

public class LanQiao143 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        // 每三瓶就换新的一瓶
        for (int i = 3; i <= n; i+=3) {
            n++;
        }
        System.out.println(n);
    }
}
