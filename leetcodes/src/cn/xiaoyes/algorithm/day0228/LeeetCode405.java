package cn.xiaoyes.algorithm.day0228;

import java.util.ArrayList;
import java.util.List;

public class LeeetCode405 {
    public static void main(String[] args) {
        System.out.println(toHex2(-1));
    }

    public static String toHex2(int num) {
        if (num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int u = num & 15;
            char c = (char)(u + '0');
            if (u >= 10) c = (char)(u - 10 + 'a');
            sb.append(c);
            num >>>= 4;
        }
        return sb.reverse().toString();
    }

    public static String toHex(int num) {
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            int cur = num;
            num = num / 16;
            list.add(cur % 16);
        }
        StringBuilder res = new StringBuilder();
        for (int cur : list) {
            if (cur < 10) {
                res.append(cur);
            } else {
                switch (cur) {
                    case 10:
                        res.append('a');
                        break;
                    case 11:
                        res.append('b');
                        break;
                    case 12:
                        res.append('c');
                        break;
                    case 13:
                        res.append('d');
                        break;
                    case 14:
                        res.append('e');
                        break;
                    case 15:
                        res.append('f');
                        break;
                }
            }
        }
        return res.reverse().toString();
    }
}
