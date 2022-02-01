package cn.xiaoyes.algorithm.day0201;

import cn.xiaoyes.algorithm.domain.TreeNode;

public class LeetCode654 {
    public static void main(String[] args) {
        LeetCode654 code = new LeetCode654();
        TreeNode root = code.constructMaximumBinaryTree(new int[]{3, 2, 1, 6, 0, 5});
        System.out.println(root.val);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length -1);
    }

    public TreeNode build(int[] nums,int lo,int hi) {
        if(lo > hi) {
            return null;
        }
        int index = -1,maxVal = Integer.MIN_VALUE;
        for(int i = lo;i <= hi;i++) {
            if(maxVal < nums[i]) {
                index = i;
                maxVal = nums[i];
            }
        }
        TreeNode root = new TreeNode(maxVal);
        root.left = build(nums,lo,index - 1);
        root.right = build(nums,index + 1,hi);
        return root;
    }
}
