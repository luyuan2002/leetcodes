package cn.xiaoyes.algorithm.day0205;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.enums.DFS;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.List;

public class LeetCode450 {
    public static void main(String[] args) {
        LeetCode450 code = new LeetCode450();
        Integer[] array = {5, 3, 6, 2, 4, null, 7};
        TreeNode root = code.deleteNode(Commons.binaryTree(array), 3);
        List<Integer> res = Commons.traverseBinaryTree(root, DFS.IN);
        System.out.println(res);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode node = root.right;
                while (node.left != null) {
                    node = node.left;
                }
                node.left = root.left;
                root = root.right;
            }
        }
        return root;
    }
}
