package cn.xiaoyes.algorithm.day0205;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.enums.DFS;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.List;

public class LeetCode701 {
    public static void main(String[] args) {
        LeetCode701 code = new LeetCode701();
        Integer[] array = {4, 2, 7, 1, 3};
        TreeNode root = code.insertInfoBST2(Commons.binaryTree(array), 5);
        List<Integer> res = Commons.traverseBinaryTree(root, DFS.IN);
        System.out.println(res);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public TreeNode insertInfoBST2(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode cur = root;
        TreeNode pre = root;
        while (cur != null) {
            pre = cur;
            if (cur.val > val) {
                cur = cur.left;
            } else if (cur.val < val) {
                cur = cur.right;
            }
        }
        if (pre.val > val) {
            pre.left = new TreeNode(val);
        } else {
            pre.right = new TreeNode(val);
        }
        return root;
    }
}
