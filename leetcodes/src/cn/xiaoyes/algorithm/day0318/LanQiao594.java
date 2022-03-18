package cn.xiaoyes.algorithm.day0318;

public class LanQiao594 {

    public static void main(String[] args) {
        /*
        * 斜着看，第1层1个，第2层2个，第3层3个...
        * 规律：第n行n列在2n-1层，即这层有2n-1个数，且(n,n)个是平均值
        * */
        int n = 20;  // n行n列
        int sum = 0;
        for (int i = 1; i <= 2 * n - 1; i++) {
            sum = sum + i;  // 计算出2n-1层的最大数
        }
        System.out.println((sum + sum - (2 * n - 1) + 1) / 2);  // sum-(2*n-1)+1是最小值，把所在层的最大的数和最小的数相加求平均得(n,n)
    }

}
