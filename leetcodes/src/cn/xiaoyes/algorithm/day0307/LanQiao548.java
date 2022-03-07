package cn.xiaoyes.algorithm.day0307;

import java.util.Scanner;

public class LanQiao548 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        while(t > 60) {
        	t -= 60;
        	a++;
        }
        b += t;
        while(b > 60) {
        	b -= 60;
        	a++;
        }
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
