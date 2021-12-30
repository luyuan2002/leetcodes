package cn.xiaoyes.algorithm.day1230;

/**
 * 实现strStr()
 */
public class Simple28 {
    public static void main(String[] args) {
        Simple28 simple = new Simple28();
        System.out.println(simple.strStr("hello", "ll"));
    }

    public int strStr(String haystack, String needle) {
        int idx = -1;
        if (haystack == null || needle == null) {
            return idx;
        }
        idx = haystack.indexOf(needle);
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i, needle.length()).equals(needle)) {
                return i;
            }
        }
        return idx;
    }
}
