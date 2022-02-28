package cn.xiaoyes.algorithm.day0228;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode2 {
    public static void main(String[] args) {
        LeetCode2 code = new LeetCode2();
        ListNode res = code.addTwoNumbers(Commons.productLikedList(9, 9, 9, 9, 9, 9, 9), Commons.productLikedList(9, 9, 9, 9));
        Commons.iterationLikedList(res);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 头节点 尾巴节点
        ListNode head = null, tail = null;
        int carry = 0;
        // 循环条件
        while (l1 != null || l2 != null) {
            // 不为空就取值否则为0
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            // 相加
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
