package cn.xiaoyes.algorithm.day0129;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode112 {
    public static void main(String[] args) {
        Integer[] data = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        int targetNum = 22;
        TreeNode root = Commons.binaryTree(data);
        System.out.println(hasPathSum(root, targetNum));
        System.out.println(hasPathSum3(root, targetNum));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            return true;
        }
        if (root.left != null) {
            if (hasPathSum(root.left, targetSum)) {
                return true;
            }
        }
        if (root.right != null) {
            if (hasPathSum(root.right, targetSum)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasPathSum2(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) return root.val == targetSum;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static boolean hasPathSum3(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(root.val);
        while (!queNode.isEmpty()) {
            TreeNode now = queNode.poll();
            int temp = queVal.poll();
            if (now.left == null && now.right == null) {
                if (temp == targetSum) {
                    return true;
                }
                continue;
            }
            if (now.left != null) {
                queNode.offer(now.left);
                queVal.offer(now.left.val + temp);
            }
            if (now.right != null) {
                queNode.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }

}
