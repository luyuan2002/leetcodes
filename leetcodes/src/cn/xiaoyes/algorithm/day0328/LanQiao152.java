package cn.xiaoyes.algorithm.day0328;

import java.util.Scanner;

public class LanQiao152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = 0;
		for (int i = 0; i <= n; i++) {
			if(i % a != 0 && i % b != 0 && i % c != 0) {
				res++;
			}
		}
		sc.close();
		System.out.println(res);
	}

}
