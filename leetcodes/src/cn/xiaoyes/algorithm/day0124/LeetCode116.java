package cn.xiaoyes.algorithm.day0124;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode116 {

    public static void main(String[] args) {

    }
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int len = que.size();
            for (int i = 0; i < len; i++) {
                Node node = que.poll();
                if (i < len - 1) {
                    node.next = que.peek();
                }
                if (node.left != null) que.offer(node.left);
                if (node.right != null) que.offer(node.right);
            }
        }
        return root;
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
}
