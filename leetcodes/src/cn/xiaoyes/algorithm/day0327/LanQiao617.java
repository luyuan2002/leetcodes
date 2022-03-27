package cn.xiaoyes.algorithm.day0327;

public class LanQiao617 {

	public static void main(String[] args) {
//		int[] f = new int[100];
//		f[0] = 1;
//		int res = 0;
//		for (int i = 1; i < 100 ; i++) {
//			f[i] = f[i - 1] + 2;
//			res++;
//			if(f[i] > 108) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(f));
//		System.out.println(res);
//		System.out.println();
		int days = 0;
		int sum = 0;
		int money = 1;
		while (sum < 108) {
			sum = sum + money;
			money += 2;
			days++;
		}
		System.out.println(days);
	}

}
