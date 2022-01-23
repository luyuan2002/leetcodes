package cn.xiaoyes.algorithm;

import cn.xiaoyes.algorithm.domain.TreeNode;

import java.util.*;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            double sum = 0;
            int len = queue.size();
            while (len > 0){
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                len--;
            }
            res.add(sum / len);
        }
        return res;
    }
}