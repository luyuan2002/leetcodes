package cn.xiaoyes.algorithm.day0120;

import java.util.Arrays;

public class LeetCode344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s) {
        int len = s.length;
        for(int i = 0;i < len / 2;i++){
            char c = s[i];
            s[i] = s[len - i -1];
            s[len -i -1] = c;
        }
        System.out.println(Arrays.toString(s));
    }
}
