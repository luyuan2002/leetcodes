package cn.xiaoyes.algorithm.day0206;

import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {
    public static void main(String[] args) {
        LeetCode17 code = new LeetCode17();
        List<String> res = code.letterCombinations("23");
        System.out.println(res);
    }

    String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()){
            return res;
        }
        backtrack(digits, 0, new StringBuilder());
        return res;
    }

    public void backtrack(String digits, int start, StringBuilder sb) {
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        for (int i = start; i < digits.length(); i++) {
            int digit = digits.charAt(i) - '0';
            for (char c : mapping[digit].toCharArray()) {
                sb.append(c);
                backtrack(digits, i + 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
