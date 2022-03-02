package cn.xiaoyes.algorithm.day0301;

import java.util.Calendar;

public class LanQiao597 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 1);
        int year = 2020;// 年
        int month = 0;// 月
        int day = 0;// 日
        int week = 0;// 周
        int sum = 0;// 总千米
        while (true) {
            // 截至跑步时间
            if (year == 2020 && month == 10 && day == 1) {
                break;
            }
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH) + 1;
            day = calendar.get(Calendar.DAY_OF_MONTH);
            week = calendar.get(Calendar.DAY_OF_WEEK);
            if (week == 2 || day == 1) {
                sum += 2;
            } else {
                sum += 1;
            }
            // 日期 + 1
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        // 输出总跑km
        System.out.println(sum);
    }
}
