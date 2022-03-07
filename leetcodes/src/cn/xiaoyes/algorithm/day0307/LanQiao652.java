package cn.xiaoyes.algorithm.day0307;

public class LanQiao652 {

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				if (97 * i - 127 * j == 1) {
					System.out.println(i + j);
					break;
				}
			}
		}
	}

}
