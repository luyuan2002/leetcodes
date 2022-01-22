package cn.xiaoyes.algorithm.day0122;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode150 {
    public static void main(String[] args) {
        String[] res = {"4", "3", "-"};
        System.out.println(evalRPN(res));
    }

    public static int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();
        for (String s : tokens) {
            switch (s) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int p1 = stack.pop();
                    int p2 = stack.pop();
                    stack.push(p2 / p1);
                    break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}
