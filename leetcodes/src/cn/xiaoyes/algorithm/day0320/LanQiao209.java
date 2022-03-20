package cn.xiaoyes.algorithm.day0320;

import java.util.Scanner;

/**
 * 未提交成功
 * @author BPDBSIR
 *
 */
public class LanQiao209 {

	public static void main(String[] args) {
		/**
		 * 原硬币: **********
		   目标硬币: o****o****
		   
		   投掷过程:
		   oo********  1
		   o*o*******  2
		   o**o******  3
		   o***o*****  4
		   o****o****  5
		 */
		Scanner sc = new Scanner(System.in);
		String source = sc.next();
		String target = sc.next();
		sc.close();
		int step = 0;
		StringBuilder sb = new StringBuilder(source);
		for (int i = 0; i < sb.length() - 1; i++) {
			if(sb.charAt(i) == 'o') {
				sb.setCharAt(i, '*');
			}else {
				sb.setCharAt(i, 'o');
			}
			if(sb.charAt(i + 1) == 'o') {
				sb.setCharAt(i + 1, '*');
			}else {
				sb.setCharAt(i + 1, 'o');
			}
			step++;
			if(sb.toString().equals(target)) {
				System.out.println(step);
				break;
			}
		}
	}
}
