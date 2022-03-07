package cn.xiaoyes.algorithm.day0306;

import java.util.Scanner;

public class LanQiao160 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String str = sc.next();
		for (char c : str.toCharArray()) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				a++;
			}else {
				b++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		sc.close();
	}
}
