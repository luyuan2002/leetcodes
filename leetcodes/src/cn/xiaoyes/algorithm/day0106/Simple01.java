package cn.xiaoyes.algorithm.day0106;

import java.util.Scanner;

/**
 * 递归求1-n的和
 */
public class Simple01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入n: ");
        System.out.println("计算结果是: " + fn(sc.nextInt()));
    }

    public static int fn(int n){
        if (n == 1){
            return 1;
        }
        return n + fn(n - 1);
    }
}
