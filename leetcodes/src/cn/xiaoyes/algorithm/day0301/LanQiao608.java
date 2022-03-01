package cn.xiaoyes.algorithm.day0301;

public class LanQiao608 {
    public static void main(String[] args) {
        int n = 0;
        while (n < 2018) {
            int i = n;
            boolean f = true;
            while (i > 1) {
                if (n % i != 0) {
                    f = false;
                    break;
                }
                i--;
            }
            if (f){
                n++;
            }else {
                break;
            }
        }
    }
}
