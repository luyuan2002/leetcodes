package cn.xiaoyes.algorithm.day0311;

public class LanQiao1444 {

	public static void main(String[] args) {
		for (long i = 1; i <= 1000000007; i++) {
			long n = i * 2021 % 1000000007;
			if(n == 999999999) {
				System.out.println(i);
				break;
			}
		}
	}

}
