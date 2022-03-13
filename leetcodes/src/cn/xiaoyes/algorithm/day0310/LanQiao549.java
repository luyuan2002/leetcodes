package cn.xiaoyes.algorithm.day0310;

import java.util.Scanner;

/**
 * 题目链接: https://www.lanqiao.cn/problems/549/learning/
 * @author BPDBSIR
 * 本题的难点在于 "对于没有地雷的方格，输出这格周围的地雷数量" 周围是多大?
 * 观察本题的输入以及输出数据推导出 周围是指当前格为中心 向外扩展成3*3的矩阵 只要是在这个矩阵内的数据 就属于 "周围数据"
 */
public class LanQiao549 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n + 2][m + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[n + 2][m + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (matrix[i][j] == 1) {
                    res[i][j] = 9;
                    continue;
                }
                int sum = matrix[i][j] + matrix[i - 1][j - 1] + matrix[i - 1][j] + matrix[i - 1][j + 1] +
                        matrix[i][j - 1] + matrix[i][j + 1] + matrix[i + 1][j - 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                res[i][j] = sum;
            }
        }
		for (int i = 1; i < res.length - 1; i++) {
			for (int j = 1; j < res.length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
        sc.close();
    }
}
