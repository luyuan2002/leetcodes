package cn.xiaoyes.algorithm.day0313;

import java.util.Arrays;

/**
 * 
 * @author BPDBSIR
 * 题目要求***(1) + ***(2) = ***(3) 也就是所有的三位数加上三位数等于另外一个三位数 并且1 2 3中的每一个数字都是不同的
 * 使用两层for循环第一层代表(1) 第二层代表(2) 然后将i + j相加得到k 并且判断i + j + k 拼接起来的字符串是否为123456789 如果是就满足了该算式中每个数字只用了一次
 * 并且判断i + j是否和等于(i + j)的值 如果以上条件满足 则证明这是一次有效的算式 至此sum累加
 */
public class LanQiao731 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int k = i + j;
				String a = "" + i + j + k;
				char[] b = a.toCharArray();
				Arrays.sort(b);
				String s = String.valueOf(b);
				if (s.equals("123456789") && i + j == k) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}

}
