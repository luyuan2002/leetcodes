package cn.xiaoyes.algorithm.day0123;

import cn.xiaoyes.algorithm.domain.TreeNode;

import java.util.*;

public class LeetCode102 {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(3);
        TreeNode two = new TreeNode(9);
        TreeNode three = new TreeNode(20);
        TreeNode four = new TreeNode(15);
        TreeNode five = new TreeNode(7);

        one.left = two;
        one.right = three;
        three.left = four;
        three.right = five;
        System.out.println(levelOrder(one));
        System.out.println(levelOrder2(one));
    }


    /**
     * 迭代层序遍历
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int len = queue.size();
            while (len > 0) {
                TreeNode node = queue.poll();
                item.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                len--;
            }
            res.add(item);
        }
        return res;
    }

    /**
     * 递归层序遍历
     *
     * @param root
     * @return
     */
    public static List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        cascade(root, 0, res);
        return res;
    }

    public static void cascade(TreeNode node, Integer deep, List<List<Integer>> res) {
        if (node == null) return;
        deep++;
        if (res.size() < deep) {
            List<Integer> item = new ArrayList<>();
            res.add(item);
        }
        res.get(deep - 1).add(node.val);
        cascade(node.left, deep, res);
        cascade(node.right, deep, res);
    }
}
