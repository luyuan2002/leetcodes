package cn.xiaoyes.algorithm.day0307;

public class LanQiao1028 {

	public static void main(String[] args) {
		int res = 0;
		for (int i = 4; i <= 2020; i++) {
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					res++;
					break;
				}
			}
		}
		System.out.println(res);
	}
}
