package cn.xiaoyes.algorithm.day0327;

/**
 * 
 * 未完成
 * @author BPDBSIR
 *
 */
public class LanQiao719 {

	public static void main(String[] args) {
		int[][] mx = { { 16, 0, 0, 13 }, { 0, 0, 11, 0 }, { 9, 0, 0, 0 }, { 0, 15, 0, 1 }, };
	}

	public static void f(int[][] mx) {
	
	}

	public static boolean ck(int[][] mx, int row, int col) {
		int a = 0, b = 0, c = 0, d = 0;
		for (int i = 0; i < mx.length; i++) {
			a += mx[row][i];
		}
		for (int i = 0; i < mx.length; i++) {
			b += mx[i][col];
		}
		int f = 0;
		for (int i = 0; i < mx.length; i++) {
			b += mx[i][f];
			f++;
		}
		f = 0;
		for (int i = mx.length; i >= 0; i++) {
			d += mx[i][f];
		}
		if(a == b && b == c && c == d) {
			return true;
		}
		return false;
	}

}
