package cn.xiaoyes.algorithm.day0303;

public class LanQiao559 {
    public static void main(String[] args) {
        long n = 0;
        for (int i = 1; i <= 2019; i++) if (verification(i)) n += i * i;
        System.out.println(n);
    }

    public static boolean verification(int n){
        boolean f = false;
        while (n > 0){
            int i = n % 10;
            if (i == 2 || i == 0 || i == 1 || i == 9){
                f = true;
                break;
            }
            n /= 10;
        }
        return f;
    }
}
