package cn.xiaoyes.algorithm.dya0331;

import java.util.Scanner;

public class LanQiao661 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 1125, b = 1126, c = 1727, d = 1728;
		while ((b + 1) != c) {
			b += 2;
			c -= 2;
		}
		System.out.printf("%d", b / 2 * 4);
		scan.close();
	}

}
