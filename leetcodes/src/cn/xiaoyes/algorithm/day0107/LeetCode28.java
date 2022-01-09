package cn.xiaoyes.algorithm.day0107;

/**
 * 28.实现strStr()
 */
public class LeetCode28 {
    public static void main(String[] args) {
        System.out.println(strStr("", ""));
    }

    public static int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)){
            return 0;
        }
        if (haystack.length() == needle.length()){
            if (haystack.equals(needle)){
                return 0;
            }
            return -1;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i,needle.length() + i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
