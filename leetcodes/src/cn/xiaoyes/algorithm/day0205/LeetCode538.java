package cn.xiaoyes.algorithm.day0205;

import cn.xiaoyes.algorithm.domain.TreeNode;

import java.util.Stack;

public class LeetCode538 {
    public static void main(String[] args) {

    }

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.right);
        sum += root.val;
        root.val = sum;
        traverse(root.left);
    }


    int pre = 0;

    public TreeNode convertBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.right;
            }else {
                cur = stack.pop();
                cur.val += pre;
                pre = cur.val;
                cur = cur.left;
            }
        }
        return root;
    }
}
