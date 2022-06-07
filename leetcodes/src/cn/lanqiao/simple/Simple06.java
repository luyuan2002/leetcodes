package cn.lanqiao.simple;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取时间
 */
public class Simple06 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        l /= 1000;
        System.out.println(l);
        l %= 86400;
        System.out.println(l);
        long h = l / 3600;
        l %= 3600;
        long m = l / 60;
        long s = l % 60;
        System.out.printf("%02d:%02d:%02d", h, m, s);*/
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date(46800999)));
    }
}
