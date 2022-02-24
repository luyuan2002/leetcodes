package cn.xiaoyes.algorithm.day0221;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode83 {
    public static void main(String[] args) {
        LeetCode83 code = new LeetCode83();
        ListNode head = code.deleteDuplicates(Commons.productLikedList(1, 1, 2, 3, 3));
        Commons.iterationLikedList(head);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

}
