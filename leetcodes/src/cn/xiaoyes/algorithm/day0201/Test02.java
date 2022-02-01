package cn.xiaoyes.algorithm.day0201;

import java.util.Deque;
import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            q.offerLast(i);
        }
        q.offerFirst(100);
        q.offerLast(200);
        for (int i = 0; i < 10; i++) {
            System.out.println(q.pollFirst());
        }
    }
}
