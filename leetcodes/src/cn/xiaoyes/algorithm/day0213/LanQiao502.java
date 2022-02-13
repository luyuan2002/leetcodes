package cn.xiaoyes.algorithm.day0213;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LanQiao502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        List<Integer> res = new ArrayList<>();
        int a = 0, b = 0, c = 0, d = 0,e = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        while ((s = sc.nextLine()) != null) {
            if (s.equals("")){
                break;
            }
            double cur = Double.parseDouble(s);
            if (cur >= 85) {
                // Youxiu
                a += cur;
                b++;
            } else if (cur >= 60) {
                // 及格
                c += cur;
                d++;
            }
            e++;
        }
        System.out.println(Double.parseDouble(df.format(b / e * 100L)) + "%");
        System.out.println(Double.parseDouble(df.format(d / e * 100L)) + "%");
        sc.close();
    }
}
