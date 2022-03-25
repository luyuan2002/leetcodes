package cn.xiaoyes.algorithm.day0325;

import java.util.Scanner;

/**
 * ci初始化长草的状态
 *   如果此处有草就初始化为1
 *   否则为0
 * 循环遍历ci数组 判断此处是否右草 如果有草就将改位置的上左右下累加1 前提是要注意边界条件(比如说第一行有草的地方是无法往上长的)
 * 跳出条件为: t = k + 1 t记录了当前的执行次数 如果等于k + 1就跳出循环
 * 循环执行完毕之后如果还有位置为0的元素就证明此处还是空地 输出"."即可 长草的地方输出"g"
 */
public class LanQiao149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] cs = new char[n][m];
        int[][] ci = new int[n][m];
        for (int i = 0; i < n; i++) cs[i] = sc.next().toCharArray();
        int k = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (cs[i][j] == 'g') ci[i][j] = 1;
            }
        }
        int t = 1;
        while (true) {
            if (t == k + 1) break;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (ci[i][j] == t) {
                        // 上
                        if (i - 1 >= 0 && ci[i - 1][j] == 0) ci[i - 1][j] = t + 1;
                        // 左
                        if (j - 1 >= 0 && ci[i][j - 1] == 0) ci[i][j - 1] = t + 1;
                        // 右
                        if (j + 1 < m && ci[i][j + 1] == 0) ci[i][j + 1] = t + 1;
                        // 下
                        if (i + 1 < n && ci[i + 1][j] == 0) ci[i + 1][j] = t + 1;
                    }
                }
            }
            t++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (ci[i][j] != 0) System.out.print("g");
                else System.out.print(".");
            }
            System.out.println();
        }
    }

}
