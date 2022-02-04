package cn.xiaoyes.algorithm.day0204;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode530 {
    public static void main(String[] args) {
        LeetCode530 code = new LeetCode530();
        Integer[] array = {4, 2, 6, 1, 3};
        int ret = code.getMinimumDifference3(Commons.binaryTree(array));
        System.out.println(ret);
    }

    /**
     * 二叉搜索树的最小对差
     *
     * @param root 根节点
     * @return 差值
     */
    public int getMinimumDifference(TreeNode root) {
        List<Integer> res = domain(root, new ArrayList<>());
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < res.size(); i++) {
            ans = Math.min(ans, res.get(i) - res.get(i - 1));
        }
        return ans;
    }

    /**
     * 中序遍历并将值写入到List集合中
     *
     * @param root 根节点
     * @param res  集合
     * @return 最终集合
     */
    public List<Integer> domain(TreeNode root, List<Integer> res) {
        if (root == null) {
            return null;
        }
        domain(root.left, res);
        res.add(root.val);
        domain(root.right, res);
        return res;
    }

    int res = Integer.MAX_VALUE;

    TreeNode pre;

    public int getMinimumDifference2(TreeNode root) {
        dfs(root);
        return res;
    }

    /**
     * 深度优先搜索(中序遍历)
     *
     * @param root
     */
    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != null) {
            res = Math.min(res, root.val - pre.val);
        }
        pre = root;
        dfs(root.right);
    }

    /**
     * 广度优先搜索
     *
     * @param root
     * @return
     */
    public int getMinimumDifference3(TreeNode root) {
        int res = Integer.MAX_VALUE;
        TreeNode pre = null;
        TreeNode cur = root;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            if (pre != null) {
                res = Math.min(res, cur.val - pre.val);
            }
            pre = cur;
            cur = cur.right;
        }
        return res;
    }
}
