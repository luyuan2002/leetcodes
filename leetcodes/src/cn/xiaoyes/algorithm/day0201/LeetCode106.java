package cn.xiaoyes.algorithm.day0201;

import cn.xiaoyes.algorithm.domain.TreeNode;

import java.util.HashMap;

public class LeetCode106 {
    public static void main(String[] args) {
        LeetCode106 code = new LeetCode106();
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = code.buildTree(inorder, postorder);
        System.out.println(root.val);
    }

    HashMap<Integer, Integer> memo = new HashMap<>();

    int[] post;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) memo.put(inorder[i], i);
        post = postorder;
        return buildTree(0, inorder.length - 1, 0, post.length - 1);
    }

    public TreeNode buildTree(int is, int ie, int ps, int pe) {
        if (ie < is || pe < ps) return null;
        int root = post[pe];
        int ri = memo.get(root);
        TreeNode node = new TreeNode(root);
        node.left = buildTree(is, ri - 1, ps, ps + ri - is - 1);
        node.right = buildTree(ri + 1, ie, ps + ri - is, pe - 1);
        return node;
    }
}
