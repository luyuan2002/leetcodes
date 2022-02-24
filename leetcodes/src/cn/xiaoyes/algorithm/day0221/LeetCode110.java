package cn.xiaoyes.algorithm.day0221;

import cn.xiaoyes.algorithm.domain.TreeNode;

public class LeetCode110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = getHeight(root.left);
        if (lh == -1) return -1;
        int rh = getHeight(root.right);
        if (rh == -1) return -1;

        int res;
        if (Math.abs(lh - rh) > 1) {
            res = -1;
        } else {
            res = 1 + Math.max(lh, rh);
        }
        return res;
    }
}
