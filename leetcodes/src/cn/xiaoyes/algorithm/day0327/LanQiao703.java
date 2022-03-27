package cn.xiaoyes.algorithm.day0327;

public class LanQiao703 {

	static int ans = 0;
	public static void main(String[] args) {
		f(5,9,2);
		System.out.println(ans);
	}

	/**
	 * 
	 * @param a 遇店
	 * @param b 遇花
	 * @param c 剩余酒
	 * @return
	 */
	public static void f(int dian, int hua, int jiu) {
		if (dian > 0)
			f(dian - 1, hua, jiu * 2);
		if (hua > 0)
			f(dian, hua - 1, jiu - 1);
		if (dian == 0 && hua == 0 && jiu == 1) {
			ans++;
		}
	}
}
