package cn.xiaoyes.algorithm.day0122;

public class LeetCode28 {
    public static void main(String[] args) {
//        System.out.println(strStr("abc", "c"));
        System.out.println(kmp("abeababeabf","abeabf"));
//        System.out.println(kmp2("abeababeabf","abeabf"));
    }

    /**
     * 暴力破解
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)){
            return 0;
        }
        int n = haystack.length(), m = needle.length();
        if (n == m){
            if (haystack.equals(needle)){
                return 0;
            }
            return -1;
        }
        char[] s = haystack.toCharArray(), p = needle.toCharArray();
        for (int i = 0; i <= n - m; i++) {
            int a = i, b = 0;
            while (b < m && s[a] == p[b]) {
                a++;
                b++;
            }
            if (b == m) return i;
        }
        return -1;
    }

    /**
     * KMP算法
     * @param haystack 文本串
     * @param needle 模式串
     * @return 索引
     */
    public static int kmp(String haystack, String needle){
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        char[] t = haystack.toCharArray();
        char[] p = needle.toCharArray();
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && p[i] != p[j]) {
                j = pi[j - 1];
            }
            if (p[i] == p[j]) {
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i < n; i++) {
            while (j > 0 && t[i] != p[j]) {
                j = pi[j - 1];
            }
            if (t[i] == p[j]) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }
    // KMP 算法
    // ss: 原串(string)  pp: 匹配串(pattern)
    public static int kmp2(String ss, String pp) {
        if (pp.isEmpty()) return 0;

        // 分别读取原串和匹配串的长度
        int n = ss.length(), m = pp.length();
        // 原串和匹配串前面都加空格，使其下标从 1 开始
        ss = " " + ss;
        pp = " " + pp;

        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();

        // 构建 next 数组，数组长度为匹配串的长度（next 数组是和匹配串相关的）
        int[] next = new int[m + 1];
        // 构造过程 i = 2，j = 0 开始，i 小于等于匹配串长度 【构造 i 从 2 开始】
        for (int i = 2, j = 0; i <= m; i++) {
            // 匹配不成功的话，j = next(j)
            while (j > 0 && p[i] != p[j + 1]) j = next[j];
            // 匹配成功的话，先让 j++
            if (p[i] == p[j + 1]) j++;
            // 更新 next[i]，结束本次循环，i++
            next[i] = j;
        }

        // 匹配过程，i = 1，j = 0 开始，i 小于等于原串长度 【匹配 i 从 1 开始】
        for (int i = 1, j = 0; i <= n; i++) {
            // 匹配不成功 j = next(j)
            while (j > 0 && s[i] != p[j + 1]) j = next[j];
            // 匹配成功的话，先让 j++，结束本次循环后 i++
            if (s[i] == p[j + 1]) j++;
            // 整一段匹配成功，直接返回下标
            if (j == m) return i - m;
        }

        return -1;
    }
}
