package cn.xiaoyes.algorithm.day0203;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.LinkedList;

public class    LeetCode617 {
    public static void main(String[] args) {
        TreeNode t1 = Commons.binaryTree(new Integer[]{1, 3, 2, 5});
        TreeNode t2 = Commons.binaryTree(new Integer[]{2, 1, 3, null, 4, null, 7});
        LeetCode617 code = new LeetCode617();
        TreeNode root = code.mergeTrees2(t1, t2);
        Commons.dfs(root);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == null ? t2 : t1;
        }
        TreeNode t = new TreeNode(t1.val + t2.val);
        t.left = mergeTrees(t1.left, t2.left);
        t.right = mergeTrees(t1.right, t2.right);
        return t;
    }

    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == null ? t2 : t1;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(t1);
        queue.add(t2);
        while (queue.size() > 0) {
            TreeNode r1 = queue.remove();
            TreeNode r2 = queue.remove();
            r1.val += r2.val;
            // 如果r1和r2的左子树都不为空 就放到队列中
            // 如果r1的左子树为空 就把r2的左子树挂到r1的左子树上
            if (r1.left != null && r2.left != null) {
                queue.add(r1.left);
                queue.add(r2.left);
            } else if (r1.left == null) {
                r1.left = r2.left;
            }
            // 右子树也是一样的
            if (r1.right != null && r2.right != null) {
                queue.add(r1.right);
                queue.add(r2.right);
            } else if (r1.right == null) {
                r1.right = r2.right;
            }
        }
        return t1;
    }
}
