package cn.xiaoyes.algorithm.day0128;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 */
public class LeetCode257 {
    public static void main(String[] args) {
        System.out.println(binaryTreePaths(Commons.binaryTree(new Integer[]{1, 2, 3, null, 5})));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        traversal(root,"",res);
        return res;
    }

    public static void traversal(TreeNode root,String path,List<String> res){
        if (root != null){
            StringBuilder sb = new StringBuilder(path);
            sb.append(root.val);
            if (root.left == null && root.right == null){
                res.add(sb.toString());
            }else {
                sb.append("->");
                traversal(root.left, sb.toString(), res);
                traversal(root.right, sb.toString(), res);
            }
        }
    }
}
