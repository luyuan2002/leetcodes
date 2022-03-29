package cn.xiaoyes.algorithm.day0329;

import java.util.Scanner;

public class LanQiao197 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] res = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				res[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i < m; i++) {
			for (int j = n - 1; j >= 0; j--) {
				System.out.print(res[j][i] + " ");
			}
			System.out.println();
		}
	}

}
