package cn.xiaoyes.algorithm.day0330;

/**
 * 拆分、判断
 */
public class LanQiao681 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 1; i < 10000; i++) {
            int t = i * i * i;
            char[] cs = String.valueOf(t).toCharArray();
            int sum = 0;
            for (char c : cs) {
                sum += (int) c - 48;
            }
            if (i == sum) {
                System.out.println(i);
                res++;
            }
        }
        System.out.println("total => " + res);
    }
}
