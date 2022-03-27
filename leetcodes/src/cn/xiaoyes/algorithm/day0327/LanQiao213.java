package cn.xiaoyes.algorithm.day0327;

import java.util.Scanner;

/**
 * 
 * @author BPDBSIR
 *
 */
public class LanQiao213 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		boolean[] f = new boolean[m * n - m - n + 1];
		for (int i = 0; i < f.length; i++) {
			if(i % n == 0) {
				f[i] = true;
			}
			if(i % m == 0) {
				f[i] = true;
			}
		}
		for (int i = 1; i < f.length; i++) {
			if(f[i]) {
				if(i + n < f.length) {
					f[i + n] = true;
				}
				if(i + m < f.length) {
					f[i + m] = true;
				}
			}
		}
		int max = 0;
		for (int i = 1; i < f.length; i++) {
			if(!f[i]) {
				max = Math.max(max, i);
			}
		}
		System.out.println(max);
	}

}
