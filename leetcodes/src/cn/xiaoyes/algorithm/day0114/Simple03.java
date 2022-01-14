package cn.xiaoyes.algorithm.day0114;

/**
 * 一列数的规则如下:1、1、2、3、5、8、13、21、34 ，求第n位数是多少?使用递归实现
 */
public class Simple03 {
    public static void main(String[] args) {
        System.out.println(fn(8));
    }

    public static int fn(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fn(n - 1) + fn(n - 2);
    }
}
