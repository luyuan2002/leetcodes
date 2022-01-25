package cn.xiaoyes.algorithm.day0125;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode101 {
    public static void main(String[] args) {
        TreeNode root = Commons.binaryTree(Commons.GenList(1, 2, 2, 3, 4, 4, 3), 0);
        System.out.println(isSymmetric(root));
        System.out.println(isSymmetric2(root));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        return compare(root.left, root.right);
    }

    public static boolean compare(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.val == b.val && compare(a.left, b.right) && compare(a.right, b.left);
    }


    public static boolean isSymmetric2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode u = q.poll();
            TreeNode v = q.poll();
            if (u == null && v == null){
                continue;
            }
            if ((u == null || v == null) || (u.val != v.val)){
                return false;
            }
            q.offer(u.left);
            q.offer(v.right);
            q.offer(u.right);
            q.offer(v.left);
        }
        return true;
    }

}
