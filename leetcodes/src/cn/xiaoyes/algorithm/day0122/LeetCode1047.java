package cn.xiaoyes.algorithm.day0122;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode1047 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || c != stack.peek()) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
