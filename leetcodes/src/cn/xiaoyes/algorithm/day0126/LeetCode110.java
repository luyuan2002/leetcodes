package cn.xiaoyes.algorithm.day0126;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode110 {
    public static void main(String[] args) {
        isBalanced(Commons.binaryTree(Commons.GenList(3,9,20,null,null,15,7)));
    }

    public static boolean isBalanced(TreeNode root) {
        return getHeight(root) != -1;
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = getHeight(root.left);
        if (lh == -1) return -1;
        int rh = getHeight(root.right);
        if (rh == -1) return -1;

        int res;
        if (Math.abs(lh - rh) > 1){
            res = -1;
        }else {
            res = 1 + Math.max(lh,rh);
        }
        return res;
    }
}
