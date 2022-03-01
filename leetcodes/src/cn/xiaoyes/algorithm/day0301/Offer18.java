package cn.xiaoyes.algorithm.day0301;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class Offer18 {

    public static void main(String[] args) {
        Offer18 offer = new Offer18();
        ListNode root = offer.deleteNode(Commons.productLikedList(4, 5, 1, 9), 5);
        Commons.iterationLikedList(root);
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) pre.next = cur.next;
        return head;
    }
}
