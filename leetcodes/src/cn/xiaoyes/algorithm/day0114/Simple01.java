package cn.xiaoyes.algorithm.day0114;

/**
 * 使用递归求1-n的和
 */
public class Simple01 {
    public static void main(String[] args) {
        System.out.println(fn(5));
    }

    public static int fn(int n){
        if (n == 1){
            return 1;
        }
        return n + fn(n -1);
    }
}
