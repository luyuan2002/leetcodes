package cn.xiaoyes.algorithm.day0320;

public class LanQiao1033 {
	
	static int num = 0;

	public static void main(String[] args) {
		dfs(2019, 1);
		System.out.println(num);
	}

	public static void dfs(int x, int y) {
		if (x < 0) {
			return;
		} else if (x == 0) {
			num++;
			return;
		}
		for (int i = y; i <= 44; i++) {
			dfs(x - i * i, i + 1);
		}
	}
}
