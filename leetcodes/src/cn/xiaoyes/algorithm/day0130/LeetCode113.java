package cn.xiaoyes.algorithm.day0130;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode113 {
    public static void main(String[] args) {
        Integer[] data = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        int targetSum = 22;
        LeetCode113 code = new LeetCode113();
        List<List<Integer>> res = code.pathSum(Commons.binaryTree(data), targetSum);
        res.forEach(System.out::println);
    }

    List<List<Integer>> res = new ArrayList<>();

    Deque<Integer> path = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null){
            return res;
        }
        dfs(root,targetSum);
        return res;
    }

    public void dfs(TreeNode root,int targetSum) {
        if (root == null){
            return;
        }
        path.offerLast(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0){
            res.add(new LinkedList<>(path));
        }
        dfs(root.left,targetSum);
        dfs(root.right,targetSum);
        path.pollLast();
    }
}
