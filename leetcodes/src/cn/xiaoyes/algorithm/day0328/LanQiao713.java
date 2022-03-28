package cn.xiaoyes.algorithm.day0328;

/**
 * 
 * @author BPDBSIR
 *
 */
public class LanQiao713 {

	public static void main(String[] args) {
		System.out.println(fn(0, 0));
	}

	public static int fn(int x, int y) {
		if (x == 3 || y == 4) {
			return 1;
		} else {
			return fn(x + 1, y) + fn(x, y + 1);
		}
	}
}
