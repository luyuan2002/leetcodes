package cn.xiaoyes.algorithm.day0314;

public class Demo01 {

	public static void main(String[] args) {
		int[][] matrix = {
				{ 1, 3, 1 },
				{ 1, 5, 1 },
				{ 4, 2, 1 }
		};
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] f = new int[m][n];
		for (int i = 0; i < m; i++) {
			f[0][i] = matrix[0][i];
		}
		// bottom right
		// 1 + 3 + 5 + 2 = 11
		for (int i = 1; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(j == n) {
					f[i][j] = Math.max(matrix[i - 1][j], matrix[i][j]) + f[i][j];
				}else {
					f[i][j] = Math.max(matrix[i - 1][j], matrix[i - 1][j + 1]) + f[i][j];
				}
			}
		}
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			res = Math.max(m, f[m][i]);
		}
		System.out.println(res);
	}

}
