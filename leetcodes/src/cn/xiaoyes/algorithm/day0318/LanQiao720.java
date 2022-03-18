package cn.xiaoyes.algorithm.day0318;

public class LanQiao720 {
    public static void main(String[] args) {
        double mon = 30000;
        for (int i = 1; i <= 15; i++) {
            double a = 1250 + mon * 0.005;
            if (i == 15){
                System.out.println(a);
            }
            mon -= a;
        }

    }
}
