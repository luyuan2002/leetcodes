package cn.xiaoyes.algorithm.day0406;

import java.util.Calendar;

public class LanQiao720 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int i = 2099; i <= 9999; i += 100) {
            // 设置日期
            calendar.set(i, 11, 31);
            // 判断当前日期是否为星期一
            if (calendar.get(Calendar.DAY_OF_WEEK) == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
