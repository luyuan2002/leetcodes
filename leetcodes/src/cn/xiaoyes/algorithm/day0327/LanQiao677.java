package cn.xiaoyes.algorithm.day0327;

public class LanQiao677 {

	static int res = 0;
	public static void main(String[] args) {
		System.out.println(1542.0 / 2.0 % 2);
		int n = 1543;
		while(true) {
			if(n == 0) {
				break;
			}
			Double d = Double.parseDouble("" + n);
			if(d.doubleValue() / 2 % 2 != 0) {
				n--;
				res++;
			}
			n /= 2;
		}
		System.out.println(res);
	}
	
}
