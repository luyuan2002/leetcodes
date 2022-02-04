package cn.xiaoyes.algorithm.day0204;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode98 {

    public static void main(String[] args) {
        LeetCode98 code = new LeetCode98();
        Integer[] array = {2, 1, 3};
//        System.out.println(code.isValidBST(Commons.binaryTree(array)));
//        System.out.println(code.isValidBST2(Commons.binaryTree(array)));
        System.out.println(code.isValidBST3(Commons.binaryTree(array)));
    }

    TreeNode max;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;
        return isValidBST(root.right);
    }

    long pre = Long.MIN_VALUE;

    public boolean isValidBST2(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST2(root.left)) {
            return false;
        }
        if (root.val <= pre) {
            return false;
        }
        pre = root.val;
        return isValidBST2(root.right);
    }

    public boolean isValidBST3(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val <= inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }
}
