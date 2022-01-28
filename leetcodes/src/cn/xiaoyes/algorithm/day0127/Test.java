package cn.xiaoyes.algorithm.day0127;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class Test {
    public static void main(String[] args) {
        Integer[] nodes = {1, 2, 5, 3, 4, 6, 7};
        TreeNode root = Commons.binaryTree(nodes);
        traverse(root,1);
    }

    static void traverse(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        System.out.printf("节点%s 在第%s层", root, level);
//        traverse(root.left,);
    }
}
