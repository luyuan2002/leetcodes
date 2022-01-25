package cn.xiaoyes.algorithm.day0124;

import cn.xiaoyes.algorithm.domain.TreeNode;

import java.util.*;

public class LeetCode515 {
    public static void main(String[] args) {


    }


    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            List<Integer> item = new ArrayList<>();
            int len = que.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = que.poll();
                item.add(node.val);
                if (node.left != null) que.offer(node.left);
                if (node.right != null) que.offer(node.right);
            }
            res.add(Collections.max(item));
        }
        return res;
    }


}
