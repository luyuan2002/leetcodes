package cn.xiaoyes.algorithm.day0316;

import java.util.Arrays;

public class LanQiao718 {

	public static void main(String[] args) {
		int n = 11;
		while(n < 100) {
			int a = n * n * n;
			if(a < 1000 || a > 9999) {
				continue;
			}
			int b = a * n;
			if(b < 100000 || b > 999999) {
				continue;
			}
			char[] c = String.valueOf(a + b).toCharArray();
			Arrays.sort(c);
			String d = String.valueOf(c);
			if(d.equals("0123456789")) {
				System.out.println(n);
				break;
			}
			n++;
		}
	}
}
