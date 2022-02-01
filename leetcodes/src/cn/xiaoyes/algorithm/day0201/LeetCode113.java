package cn.xiaoyes.algorithm.day0201;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.*;

public class LeetCode113 {

    public static void main(String[] args) {
        LeetCode113 code = new LeetCode113();
        Integer[] data = {5,4,8,11,null,13,4,7,2,null,null,5,1};
        int targetSum = 22;
        TreeNode root = Commons.binaryTree(data);
        List<List<Integer>> res = code.pathSum(root, targetSum);
        res.forEach(System.out::println);
        List<List<Integer>> res2 = code.pathSum2(root, targetSum);
        res2.forEach(System.out::println);
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


    List<List<Integer>> res2 = new ArrayList<>();

    Map<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();

    public List<List<Integer>> pathSum2(TreeNode root, int targetSum) {
        if(root == null) {
            return res2;
        }
        Queue<TreeNode> queNode = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNode.offer(root);
        queVal.offer(0);
        while(!queNode.isEmpty()) {
            TreeNode node = queNode.poll();
            Integer val = queVal.poll() + node.val;
            if(node.left == null && node.right == null) {
                if (val == targetSum) {
                    getPath(node);
                }
            }else{
                if(node.left != null) {
                    map.put(node.left,node);
                    queNode.offer(node.left);
                    queVal.offer(val);
                }
                if(node.right != null) {
                    map.put(node.right,node);
                    queNode.offer(node.right);
                    queVal.offer(val);
                }
            }
        }
        return res2;
    }


    public void getPath(TreeNode node) {
        List<Integer> temp = new LinkedList<Integer>();
        while (node != null) {
            temp.add(node.val);
            node = map.get(node);
        }
        Collections.reverse(temp);
        res2.add(new LinkedList<Integer>(temp));
    }
}
