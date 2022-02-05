package cn.xiaoyes.algorithm.day0205;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode235 {
    public static void main(String[] args) {
        Integer[] array = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
        TreeNode root = Commons.binaryTree(array);
        LeetCode235 code = new LeetCode235();
        TreeNode ret = code.lowestCommonAncestor2(root, new TreeNode(0), new TreeNode(8));
        System.out.println(ret.val);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
