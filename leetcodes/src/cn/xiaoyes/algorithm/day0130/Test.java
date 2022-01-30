package cn.xiaoyes.algorithm.day0130;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            deque.offerLast(i);
        }
        int len = deque.size();
        for (int i = 0; i < len; i++) {
            System.out.println(deque.pollLast());
        }
    }
}
