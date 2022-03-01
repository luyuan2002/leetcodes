package cn.xiaoyes.algorithm.day0301;

public class LanQiao597 {
    public static void main(String[] args) {
        int km = 0;
        for (int i = 2000; i <= 2020; i++) {
            for (int m = 1; m <= 12; m++) {
                int n = 1;
                for (int d = 1; d <= 30; d++) {
                    if (d == 1 || n % 7 == 1){
                        km += 2;
                    }else {
                        km += 1;
                    }
                    n++;
                }
            }
        }
        System.out.println(km);
    }
}
