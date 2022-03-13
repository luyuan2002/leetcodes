package cn.xiaoyes.algorithm.day0310;

/**
 * 矩形切割
 * @author BPDBSIR
 * 
 */
public class LanQiao607 {

	public static void main(String[] args) {
		int n = 2019;
		int m = 324;
		int res = 0;
		while(n > 0 && m > 0) {
			int max = Math.max(n, m);
			int min = Math.min(n, m);
			n = min;
			m = max - min;
			res++;
		}
		System.out.println(res);
	}

}
