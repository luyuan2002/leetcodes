package cn.xiaoyes.algorithm.day0114;

/**
 * 判断一个int类型的树是回文数
 */
public class Simple02 {
    public static void main(String[] args) {
        System.out.println(fn(12321 + ""));
    }

    public static boolean fn(String val){
        if (val.length() <=  1)
            return true;
        if (val.charAt(0) != val.charAt(val.length() - 1))
            return false;
        else
            return fn(val.substring(1,val.length() -1));
    }
}
