package cn.xiaoyes.algorithm.day0316;


public class LanQiao581 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 256;
		while (num > 1) {
			num /= 2;
			sum++;
		}
		System.out.println(sum * 4);
	}

}
