package cn.xiaoyes.algorithm.day0224;


import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class Offer25 {
    public static void main(String[] args) {
        Offer25 offer = new Offer25();
        ListNode res = offer.mergeTwoLists(Commons.productLikedList(1, 2, 4, 5), Commons.productLikedList(1, 3, 4));
        Commons.iterationLikedList(res);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(-1);
        ListNode cur = root;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return root.next;
    }
}
