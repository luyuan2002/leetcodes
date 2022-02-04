package cn.xiaoyes.algorithm.day0204;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode501 {
    public static void main(String[] args) {
        LeetCode501 code = new LeetCode501();
        Integer[] array = {1, null, 2, 2};
        int[] res = code.findMode(Commons.binaryTree(array));
        System.out.println(Arrays.toString(res));
    }

    List<Integer> res = new ArrayList<>();

    int base,count,maxCount;

    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] ret = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ret[i] = res.get(i);
        }
        return ret;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }

    public void update(int x){
        if (x == base){
            count++;
        }else {
            count = 1;
            base = x;
        }
        if (count == maxCount){
            res.add(base);
        }
        if (count > maxCount){
            maxCount = count;
            res.clear();;
            res.add(base);
        }
    }
}
