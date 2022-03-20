package cn.xiaoyes.algorithm.day0320;

/**
 * 
 * @author BPDBSIR
 *
 */
public class LanQiao627 {

	static int count = 0;

	public static void main(String[] args) {
		fn(0, 0);
		System.out.println(count);
	}

	public static void fn(int n, int i) {
		if (i == 30) {
			count++;
			return;
		}
		if (n == 0) {
			fn(1, i + 1);
		}
		fn(0, i + 1);
	}

}
