package cn.xiaoyes.algorithm.day0307;

public class LanQiao576 {
	public static void main(String[] args) {
		int res = 0;
		for (int i = 1; i < 2020; i++) {
			if(2020 % i == 0 && 3030 % i == 0) {
				res++;
			}
		}
		System.out.println(res);
	}
}
