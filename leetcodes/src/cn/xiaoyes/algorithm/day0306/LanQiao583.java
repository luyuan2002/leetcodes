package cn.xiaoyes.algorithm.day0306;

public class LanQiao583 {

	public static void main(String[] args) {
		
		int n = 0;
		for (int i = 1; i <= 2020; i++) {
			if(i % 4 == 0 && i % 6 == 0) {
				n++;
			}
		}
		System.out.println(n);

	}

}
