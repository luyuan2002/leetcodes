package cn.xiaoyes.algorithm.utils;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.domain.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Commons {

    /**
     * 迭代链表
     *
     * @param head 头节点
     */
    public static void iterationLikedList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            int val = cur.val;
            if (cur.next == null) {
                System.out.print(val + "]");
            } else if (cur.val == head.val) {
                System.out.print("[" + val + ", ");
            } else {
                System.out.print(val + ", ");
            }
            cur = cur.next;
        }
    }

    /**
     * 生产链表
     *
     * @param arr 数组
     * @return 头节点
     */
    public static ListNode productLikedList(int... arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode node = new ListNode(arr[i]);
            cur.next = node;
            cur = node;
        }
        return head;
    }

    public static int[] productArray(int... arr) {
        return Arrays.stream(arr).toArray();
    }

    /**
     * 生成二叉树
     *
     * @param rootIndex 索引
     * @param values    数据
     * @return 根节点
     */
    public static TreeNode binaryTree(Integer[] array) {
        if (array == null || array.length == 0){
            return new TreeNode(0);
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isLeft = true;
        for (int i = 1; i < array.length; i++) {
            TreeNode node = queue.peek();
            if (isLeft) {
                if (array[i] != null) {
                    node.left = new TreeNode(array[i]);
                    queue.offer(node.left);
                }
                isLeft = false;
            } else {
                if (array[i] != null) {
                    node.right = new TreeNode(array[i]);
                    queue.offer(node.right);
                }
                queue.poll();
                isLeft = true;
            }
        }
        return root;
    }

    public static Integer[] GenList(Integer... data) {
        System.out.println(Arrays.toString(Arrays.stream(data).toArray()));
        Integer[] res = new Integer[data.length];
        System.arraycopy(data, 0, res, 0, data.length);
        return res;
    }
}
