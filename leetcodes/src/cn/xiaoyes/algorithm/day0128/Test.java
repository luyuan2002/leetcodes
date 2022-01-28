package cn.xiaoyes.algorithm.day0128;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class Test {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5, 6, 6, 7, 8};
        System.out.println(count(Commons.binaryTree(data)));
    }

    public static int count(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int c1 = count(root.left);
        int c2 = count(root.right);
        return 1 + c1 + c2;
    }
}
