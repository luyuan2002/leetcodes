package cn.xiaoyes.algorithm.day0302;

public class LanQiao818 {
    public static void main(String[] args) {
        for (int i = 2; i < Integer.MAX_VALUE; i++) {
            int val = i * 2019;
            if (check(val)) {
                System.out.println(val);
                break;
            }
        }
    }
    // 检查每一位是否全部为奇数
    public static boolean check(int val) {
        while (val > 0) {
            int n = val % 10;
            if (n % 2 == 0) {
                return false;
            }
            val = val / 10;
        }
        return true;
    }
}
