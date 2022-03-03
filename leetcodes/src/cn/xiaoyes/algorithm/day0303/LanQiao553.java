package cn.xiaoyes.algorithm.day0303;

public class LanQiao553 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        sc.close();*/
        int[][] nums = {
                {-4, -5, -10, -3, 1},
                {7, 5, -9, 3, -10},
                {10, -2, 6, -10, -4}
        };
        recursion(nums, 0, 0, 0);
        System.out.println(res);
    }

    static int res = Integer.MIN_VALUE;

    public static void recursion(int[][] nums, int n, int m, int k) {
        k += nums[n][m];
        if (n == nums.length - 1 && m == nums[0].length - 1) {
            if (k > res) {
                res = k;
            }
            return;
        }
        for (int i = 1; i < nums.length - n; i++) {
            recursion(nums, n + i, m, k);
        }
        for (int i = 1; i < nums[0].length - m; i++) {
            recursion(nums, n, m + i, k);
        }
    }
}
