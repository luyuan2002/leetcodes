package cn.xiaoyes.algorithm.day0106;

/**
 * 58左边旋转字符
 */
public class Simple58 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int n = 2;
        System.out.println(s.substring(n) + s.substring(0, n));
    }
}
