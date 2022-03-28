package cn.xiaoyes.algorithm.day0328;

public class LanQiao663 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			for (int j = i; j < 100; j++) {
				sum += j;
				if(sum == 236) {
					System.out.println(i);
					break;
				}
			}
			sum = 0;
		}
	}

}
