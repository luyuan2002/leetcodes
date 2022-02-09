package cn.xiaoyes.algorithm.day0209;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Arrays;

public class LeetCode455 {
    public static void main(String[] args) {
        LeetCode455 code = new LeetCode455();
        int res = code.findContentChildren(Commons.productArray(1, 2), Commons.productArray(1, 2, 3));
        System.out.println(res);
    }

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        for (int i = 0,idx = 0; i < s.length && idx < g.length; i++) {
            if (s[i] >= g[idx]) {
                idx++;
                res++;
            }
        }
        return res;
    }
}
