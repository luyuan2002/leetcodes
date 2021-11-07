package cn.xiaoyes.algorithm.linkedlist;

import java.util.Stack;

/**
 * 演示Stack的基本使用
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // 入栈
        stack.add("Andrew");
        stack.add("Andu");
        stack.add("BJZ");
        while (stack.size() > 0){
            // 出栈
            System.out.println(stack.pop());
        }
    }
}
