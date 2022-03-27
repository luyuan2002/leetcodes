package cn.xiaoyes.algorithm.day0327;

import java.util.Scanner;

public class LanQiao246 {

	static int n = 0;
	static int m = 0;
	static int size = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.close();
		int[][] res = new int[n][m];
		fn(0,0,res);
		System.out.println(size);
	}
	
	
	public static void fn(int x, int y, int[][] res) {
		if (x == n) {
			size++;
			return;
		}
		if (ck(x, y, res)) {
			res[x][y] = 2;
			fn(y + 1 >= m ? x + 1 : x, y + 1 >= m ? 0 : y + 1, res);
		}
		res[x][y] = 1;
		fn(y + 1 >= m ? x + 1 : x, y + 1 >= m ? 0 : y + 1, res);
	}

	public static boolean ck(int x, int y, int[][] res) {
		if (y - 2 >= 0 && res[x][y - 1] == 2 && res[x][y - 2] == 2)
			return false;
		if (x - 2 >= 0 && res[x - 1][y] == 2 && res[x - 2][y] == 2)
			return false;
		return true;
	}

}
