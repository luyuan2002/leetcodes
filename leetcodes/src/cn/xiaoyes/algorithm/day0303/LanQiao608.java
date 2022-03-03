package cn.xiaoyes.algorithm.day0303;

public class LanQiao608 {
    public static void main(String[] args) {
        int i = 2;
        int loop = 1;
        while (loop < 2019) {
            i++;
            if (func(i)) loop++;
        }
        System.out.println(i);
    }

    // 质数验证
    public static boolean func(int num) {
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                res = false;
                break;
            }
        }
        return res;
    }
}
