package cn.xiaoyes.algorithm.day0205;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.enums.DFS;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.List;

public class LeetCode669 {
    public static void main(String[] args) {
        Integer[] array = {3, 0, 4, null, 2, null, null, 1};
        LeetCode669 code = new LeetCode669();
        TreeNode root = code.trimBST(Commons.binaryTree(array), 1, 2);
        List<Integer> res = Commons.traverseBinaryTree(root, DFS.IN);
        System.out.println(res);
    }

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
