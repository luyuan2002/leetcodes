package cn.xiaoyes.algorithm.day0301;

public class LanQiao738 {
    public static void main(String[] args) {
        int i, j, sum;
        for (i = 1900; i < 2012; i++) {
            for (j = 1; j < 30; j++) {
                sum = i * 10000 + 600 + j;
                if (sum % 2012 == 0 && sum % 3 == 0 && sum % 12 == 0) {
                    System.out.println(sum);
                }
            }
        }
    }
}
