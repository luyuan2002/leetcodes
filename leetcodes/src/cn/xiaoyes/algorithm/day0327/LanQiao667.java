package cn.xiaoyes.algorithm.day0327;

/**
 * 当前行 + 上一行的总数
 */
public class LanQiao667 {
    public static void main(String[] args) {
        /**
         *                   * 1
         *                 * * * 3
         *              * * * * * * 6
         *          * * * * * * * * * * 10
         */
        int[] f = new int[105];
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            f[i] = i + f[i - 1];
            sum += f[i];
        }
        System.out.println(sum);
    }
}
