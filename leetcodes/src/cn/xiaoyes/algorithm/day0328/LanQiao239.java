package cn.xiaoyes.algorithm.day0328;

import java.util.Scanner;

/**
 * ABCDEABCD XAABZ
 * 
 * @author BPDBSIR
 *
 */
public class LanQiao239 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();
		int n = S.length();
		int m = T.length();
		int dp[][] = new int[n + 1][m + 1];
		S = " " + S;
		T = " " + T;
		for (int i = 0; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j] = (int) 1e8;
			}
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (S.charAt(i) == T.charAt(j)) {
					// 相等不用改
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					// 要么改，要么s前i-1个字符已经包含了t前j个字符
					dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1] + 1);
				}
			}
		}
		System.out.println(dp[n][m]);
	}

}
