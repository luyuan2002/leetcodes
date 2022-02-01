package cn.xiaoyes.algorithm.day0201;

public class Test {
    public static void main(String[] args) {
        String s = "dlroW olleH";
        reverse(s);
        System.out.println();
        reverse2(0,s.toCharArray());
    }

    public static void reverse(String s) {
        reverse(s, s.length() - 1);
    }

    public static void reverse(String s, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(s.charAt(n));
        n -= 1;
        reverse(s, n);
    }

    public static void reverse2(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        reverse2(index + 1, str);
        System.out.print(str[index]);
    }
}
