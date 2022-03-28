package cn.xiaoyes.algorithm.day0328;

import java.util.Scanner;

/**
 * 取余运算即可
 * @author BPDBSIR
 *
 */
public class LanQiao210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int i = 1;
		while(true) {
			if(i % a == 0 && i % b == 0 && i % c == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}
		sc.close();
	}
}
