package cn.xiaoyes.algorithm.day0112;

import java.util.HashMap;
import java.util.Map;

/**
 * 389.找不同
 */
public class LeetCode389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
//        System.out.println(test2("a", "a"));
    }

    public static char findTheDifference(String s, String t) {
        char ans = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
            ans ^= t.charAt(i);
        }
        return ans;
    }

    /*public static char test2(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer val = map.get(s.charAt(i));
            map.put(s.charAt(i),val == null ? 1 : val + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            Integer val = map.get(t.charAt(i));
            if (val == null || val == 0){
                return t.charAt(i);
            }else {
                map.put(t.charAt(i),val);
            }
        }
        System.out.println(map);
        return 'A';
    }*/
}
