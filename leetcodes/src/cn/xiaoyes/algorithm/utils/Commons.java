package cn.xiaoyes.algorithm.utils;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.domain.TreeNode;
import cn.xiaoyes.algorithm.enums.DFS;

import java.util.*;

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
     * @return 根节点
     */
    public static TreeNode binaryTree(Integer[] array) {
        if (array == null || array.length == 0) {
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

    /**
     * 深度优先遍历
     *
     * @param root 根节点
     */
    public static void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    /**
     * 深度优先搜索遍历二叉树
     *
     * @param root 根节点
     * @param type 遍历类型(前/中/后)
     * @return 遍历结果
     */
    public static List<Integer> traverseBinaryTree(TreeNode root, DFS type) {
        List<Integer> res = new ArrayList<>();
        dfsBinaryTree(root, res, type);
        return res;
    }

    /**
     * 深度优先搜索
     *
     * @param root 根节点
     * @param type 遍历类型
     */
    private static void dfsBinaryTree(TreeNode root, List<Integer> res, DFS type) {
        if (root == null) {
            return;
        }
        if (type == DFS.BEFORE) res.add(root.val);
        dfsBinaryTree(root.left, res, type);
        if (type == DFS.IN) res.add(root.val);
        dfsBinaryTree(root.right, res, type);
        if (type == DFS.AFTER) res.add(root.val);
    }

    /**
     * 从有序数组构建二叉搜素树
     * @param res 有序数组
     * @return 根节点
     */
    public static TreeNode BFS(Integer[] res) {
        return buildBFS(res, 0, res.length - 1);
    }

    private static TreeNode buildBFS(Integer[] res, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(res[mid]);
        root.left = buildBFS(res, left, mid - 1);
        root.right = buildBFS(res, mid + 1, right);
        return root;
    }
}
