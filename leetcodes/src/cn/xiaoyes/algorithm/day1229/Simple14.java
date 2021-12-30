package cn.xiaoyes.algorithm.day1229;

/**
 * 最长公共前缀
 */
public class Simple14 {
    public static void main(String[] args) {
        Simple14 simple = new Simple14();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(simple.longestCommonPrefix(strs));
        System.out.println(simple.test(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int len = strs[0].length();
        // 把获取数组长度的方法提取成一个变量 而不需要每次遍历在重新获取
        int count = strs.length;
        for (int i = 0; i < len; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < count; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public String test(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String res = strs[0];
        int i = 1;
        while (i < strs.length) {
            while (strs[i].indexOf(res) != 0){
                res = res.substring(0,res.length() -1);
            }
            i++;
        }
        return res;
    }
}
