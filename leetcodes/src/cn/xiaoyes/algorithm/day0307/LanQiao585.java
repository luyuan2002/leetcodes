package cn.xiaoyes.algorithm.day0307;

/**
 * Math.abs 取绝对值
 * @author BPDBSIR
 *
 */
public class LanQiao585 {

	public static void main(String[] args) {
		String s = "LANQIAO";
		char[] array = s.toCharArray();
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				res += Math.abs(array[j] - array[i]);
			}
		}
		System.out.println(res);
	}

}
