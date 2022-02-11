package cn.xiaoyes.algorithm.day0211;

import java.util.LinkedList;
import java.util.List;

public class LeetCode763 {
    public static void main(String[] args) {
        LeetCode763 code = new LeetCode763();
        List<Integer> list = code.partitionLabels("ababcbacadefegdehijhklij");

    }

    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new LinkedList<>();
        int[] edge = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            edge[chars[i] - 'a'] = i;
        }
        int k = 0;
        int last = -1;
        for (int i = 0; i < chars.length; i++) {
            k = Math.max(k, edge[chars[i] - 'a']);
            if (i == k) {
                res.add(i - last);
                last = i;
            }
        }
        return res;
    }
}
