package cn.xiaoyes.algorithm.day0129;

import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.utils.Commons;

/**
 * 513. 找树左下角的值
 */
public class LeetCode513 {
    public static void main(String[] args) {
        LeetCode513 code = new LeetCode513();
        Integer[] data = {1, 2, 3, 4, null, 5, 6, null, null, 7};
        System.out.println(code.findBottomLeftValue(Commons.binaryTree(data)));
    }

    int deep = 0;

    int value = 0;

    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root, 0);
        return value;
    }

    public void findLeftValue(TreeNode root, int deep) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (deep > this.deep) {
                value = root.val;
                this.deep = deep;
            }
        }
        findLeftValue(root.left, deep + 1);
        findLeftValue(root.right, deep + 1);
    }
}
