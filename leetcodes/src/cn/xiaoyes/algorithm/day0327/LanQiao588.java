package cn.xiaoyes.algorithm.day0327;

public class LanQiao588 {

	public static void main(String[] args) {
		int res = 0;
		for (int i = 0; i <= 2019; i++) {
			if(String.valueOf(i).contains("9")){
				res++;
			}
		}
		System.out.println(res);
	}

}
