package cn.lanqiao.start;

import java.util.Scanner;

/**
 * 纸张尺寸
 */
public class Simple03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();
        int l = 1189;
        int w = 841;
        for (int i = 1; i <= name.charAt(1) - 48; i++) {
            if (l > w){
                l /= 2;
            }else {
                w /= 2;
            }
        }
        if (l > w){
            System.out.println(l);
            System.out.println(w);
        }else {
            System.out.println(w);
            System.out.println(l);
        }
    }
}
