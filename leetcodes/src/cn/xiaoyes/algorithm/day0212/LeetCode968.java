package cn.xiaoyes.algorithm.day0212;

import cn.xiaoyes.algorithm.domain.TreeNode;

public class LeetCode968 {
    public static void main(String[] args) {

    }

    int res = 0;

    public int minCameraCover(TreeNode root) {
        if (traversal(root) == 0) {
            res++;
        }
        return res;
    }

    public int traversal(TreeNode root) {
        if (root == null) {
            return 2;
        }
        int left = traversal(root.left);
        int right = traversal(root.right);
        if (left == 2 && right == 2) {
            return 0;
        }
        if (left == 0 || right == 0) {
            res++;
            return 1;
        }
        if (left == 1 || right == 1) {
            return 2;
        }
        return -1;
    }
}
