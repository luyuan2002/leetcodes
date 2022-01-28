package cn.xiaoyes.algorithm.day0126;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class Main {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        TreeNode root = Commons.binaryTree(data);
        System.out.println(bianli(root));
    }

    public static int bianli(TreeNode root){
        return repeat(root,0);
    }

    public static int repeat(TreeNode root,int i){
        if (root == null) return 1;
        return repeat(root.left,i) + repeat(root.left,i);
    }
}
