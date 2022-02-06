package cn.xiaoyes.algorithm.day0206;

import java.util.ArrayList;
import java.util.List;

public class LeetCode93 {
    public static void main(String[] args) {
        LeetCode93 code = new LeetCode93();
        List<String> res = code.restoreIpAddresses("25525511135");
        System.out.println(res);
    }


    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return res;
        }
        backtrack(s, 0, 0);
        return res;
    }

    public void backtrack(String s, int begin, int pointNum) {
        if (pointNum == 3) {
            if (valid(s, begin, s.length() - 1)) {
                res.add(s);
            }
            return;
        }
        for (int i = begin; i < s.length(); i++) {
            if (valid(s, begin, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointNum++;
                backtrack(s, i + 2, pointNum);
                pointNum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                break;
            }
        }
    }

    public boolean valid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) {
                return false;
            }
        }
        return true;
    }
}
