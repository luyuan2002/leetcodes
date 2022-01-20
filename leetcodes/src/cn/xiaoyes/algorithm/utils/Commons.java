package cn.xiaoyes.algorithm.utils;

import cn.xiaoyes.algorithm.domain.ListNode;

import java.util.Arrays;

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
}
