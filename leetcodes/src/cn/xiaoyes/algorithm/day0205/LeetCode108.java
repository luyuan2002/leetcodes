package cn.xiaoyes.algorithm.day0205;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.enums.DFS;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.List;

public class LeetCode108 {
    public static void main(String[] args) {
        int[] res = {-10, -3, 0, 5, 9};
        LeetCode108 code = new LeetCode108();
        TreeNode root = code.sortedArrayToBST(res);
        List<Integer> resp = Commons.traverseBinaryTree(root, DFS.IN);
        System.out.println(resp);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, left, mid - 1);
        root.right = build(nums, mid + 1, right);
        return root;
    }
}
