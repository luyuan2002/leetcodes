package cn.xiaoyes.algorithm.day0306;


public class LanQiao618 {

	public static void main(String[] args) {
		for (int i = 0; i < 99999999; i++) {
			int n = i;
			if(n % 5 == 1) {
				n = (n - 1) / 5 * 4;
				if(n % 5 == 2) {
					n = (n - 2) / 5 * 4;
					if(n % 5 == 3) {
						n = (n - 3) / 5 * 4;
						if(n % 5 == 4) {
							n = (n - 4) / 5 * 4;
							if(n%5==0 && n>=5) {
								System.out.println(i);
								break;
							}
						}
					}
				}
			}
		}
	}

}
