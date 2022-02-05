package cn.xiaoyes.algorithm.day0204;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode236 {
    public static void main(String[] args) {
        LeetCode236 code = new LeetCode236();
        Integer[] array = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = code.lowestCommonAncestor(Commons.binaryTree(array), new TreeNode(5), new TreeNode(4));
        Commons.dfs(root);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) return right;
        if (right == null) return left;
        return root;
    }
}
