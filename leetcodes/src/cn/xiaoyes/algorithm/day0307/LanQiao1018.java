package cn.xiaoyes.algorithm.day0307;

public class LanQiao1018 {

	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 2020; i++) {
			if(String.valueOf(i).contains("2")) {
				n++;
			}
		}
		System.out.println(n);
	}

}
