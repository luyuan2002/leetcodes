package cn.xiaoyes.algorithm.day0120;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode0217 {
    public static void main(String[] args) {
        Commons.iterationLikedList(getIntersectionNode(Commons.productLikedList(4, 1, 8, 4, 5), Commons.productLikedList(5, 0, 1, 8, 4, 5)));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }
        return a;
    }
}
