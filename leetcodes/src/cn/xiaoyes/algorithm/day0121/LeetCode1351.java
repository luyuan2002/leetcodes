package cn.xiaoyes.algorithm.day0121;

public class LeetCode1351 {
    public static void main(String[] args) {
        int[][] arr = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(countNegatives(arr));
    }

    public static int countNegatives(int[][] grid) {
        int res = 0;
        for (int[] i : grid) {
            for (int j : i) {
                if (j < 0) res++;
            }
        }
        return res;
    }

}
