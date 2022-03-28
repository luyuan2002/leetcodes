package cn.xiaoyes.algorithm.day0328;

public class LanQiao704 {

	public static void main(String[] args) {
		int res = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 1; k < 10; k++) {
					for (int l = 1; l < 10; l++) {
						if (k == l) {
							continue;
						}
						int f1 = f(i * k, j * l);
						int f2 = f(i * 10 + k, j * 10 + l);
						if (i * j / f1 == (i * 10 + j) / f2 && j * l / f1 == (j * 10 + l) / f2) {
							res++;
						}
					}
				}
			}
		}
		
		System.out.println(res);
	}

	public static int f(int a, int b) {
		if (b == 0) {
			return a;
		}
		return f(b, a % b);
	}

}
