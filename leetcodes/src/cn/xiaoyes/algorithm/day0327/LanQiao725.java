package cn.xiaoyes.algorithm.day0327;

import java.util.Scanner;

/**
 * 请猜谜 * 请猜谜 = 请边赏灯边猜
 */
public class LanQiao725 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {
            // 结果
            String t = String.valueOf(i * i);
            // 当前数值
            String t1 = String.valueOf(i);
            // (请边赏灯边猜)长度如果等于6才判断
            if (t.length() == 6) {
                // 请 == 请                         边 == 边                      猜 == 猜
                if (t.charAt(0) == t1.charAt(0) && t.charAt(1) == t.charAt(4) && t.charAt(5) == t1.charAt(1)) {
                    System.out.println(i);
                    break;
                }
            }

        }
        scan.close();
    }
}
