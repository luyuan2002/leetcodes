package cn.xiaoyes.algorithm.day0327;

public class LanQiao675 {

	public static void main(String[] args) {
		int res = 0;
		for (int i = 21; i < 50; i++) {
			if(i % 3 == 0) res++;
		}
		System.out.println(res);
	}

}
