package cn.xiaoyes.algorithm.day0119;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Stack;

public class LeetCode19 {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
//        ListNode res = removeNthFromEnd(one, 2);
        ListNode res = stackTest(one, 2);
        Commons.iterationLikedList(res);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dumy = new ListNode(0, head);
        ListNode cur = head;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        cur = dumy;
        for (int i = 1; i < len - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dumy.next;
    }

    public static ListNode stackTest(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        cur = stack.peek();
        cur.next = cur.next.next;
        return head;
    }
}
