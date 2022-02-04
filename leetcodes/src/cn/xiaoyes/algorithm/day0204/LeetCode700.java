package cn.xiaoyes.algorithm.day0204;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Stack;

public class LeetCode700 {
    public static void main(String[] args) {
        LeetCode700 code = new LeetCode700();
        Integer[] array = {4, 2, 7, 1, 3};
        int val = 2;
        TreeNode root = code.searchBST3(Commons.binaryTree(array), val);
        Commons.dfs(root);
    }

    /**
     * 普通二叉树思想进行深度优先搜索
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        TreeNode left = searchBST(root.left, val);
        if (left != null) {
            return left;
        }
        return searchBST(root.right, val);
    }

    /**
     * 二叉搜索树思想进行深度优先搜索
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST2(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST2(root.left, val);
        } else {
            return searchBST2(root.right, val);
        }
    }

    /**
     * 普通二叉树思想进行广度优先搜索
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST3(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            if (t.val == val) {
                return t;
            }
            if (t.left != null) {
                stack.push(t.left);
            }
            if (t.right != null) {
                stack.push(t.right);
            }
        }
        return null;
    }

    /**
     * 二叉搜索树思想进行广度优先搜索
     *
     * @param root
     * @param val
     * @return
     */
    public TreeNode searchBST4(TreeNode root, int val) {
        while (root != null) {
            if (val < root.val) {
                root = root.left;
            } else if (val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }
}
