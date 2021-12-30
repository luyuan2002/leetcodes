package cn.xiaoyes.algorithm.day1226;

/**
 * @author BPDBSIR
 */
public class Simple14 {
    public static void main(String[] args) {
        Simple14 simple = new Simple14();
        System.out.println(simple.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < res.length() && j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = strs[i].substring(0, j);
            if ("".equals(res)) {
                return "";
            }
        }
        return res;
    }
}
