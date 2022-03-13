package cn.xiaoyes.algorithm.day0308;

public class LanQiao613 {

	public static void main(String[] args) {
		int count = 0;
		long num = 59084709587505L;
		for (int i = 0; Math.pow(3, i) < num; i++) {
			for (int j = 0; Math.pow(5, j) < num; j++) {
				for (int k = 0; Math.pow(7, k) < num; k++) {
					if (Math.pow(3, i) * Math.pow(5, j) * Math.pow(7, k) <= num) {
						count++;
					}
				}
			}
		}
		System.out.println(count - 1);
	}

}
