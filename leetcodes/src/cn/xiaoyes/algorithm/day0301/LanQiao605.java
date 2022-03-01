package cn.xiaoyes.algorithm.day0301;

public class LanQiao605 {
    public static void main(String[] args) {
        int n = 2019;
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            n--;
            res.append((char) (n % 26 + 'A'));
            n /= 26;
        }
        System.out.println(res.reverse());
    }
}
