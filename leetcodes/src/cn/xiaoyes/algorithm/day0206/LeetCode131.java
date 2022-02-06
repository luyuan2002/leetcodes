package cn.xiaoyes.algorithm.day0206;

import java.util.ArrayList;
import java.util.List;

public class LeetCode131 {
    public static void main(String[] args) {
        LeetCode131 code = new LeetCode131();
        List<List<String>> res = code.partition("aab");
        res.forEach(System.out::println);
    }

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(s, 0, new ArrayList<>());
        return res;
    }

    public void backtrack(String s, int begin, List<String> path) {
        if (begin >= s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < s.length(); i++) {
            if (isPalindrome(s, begin, i)) {
                path.add(s.substring(begin, i + 1));
            } else {
                continue;
            }
            backtrack(s, i + 1, path);
            path.remove(path.size() - 1);
        }
    }

    public boolean isPalindrome(String s, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
