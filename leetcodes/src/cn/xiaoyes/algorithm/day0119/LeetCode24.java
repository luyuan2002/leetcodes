package cn.xiaoyes.algorithm.day0119;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Stack;

public class LeetCode24 {
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = four;
//        ListNode res = swapPairs(one);
        ListNode res = recursion(one);
//        ListNode res = testStack(one);
        Commons.iterationLikedList(res);
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode pre = new ListNode(0, head);
        ListNode temp = pre;
        while (temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return pre.next;
    }

    public static ListNode recursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = recursion(next.next);
        next.next = head;
        return next;
    }

    public static ListNode testStack(ListNode head) {
        // 如果链表为空或者没有下一个需要交换的元素就return
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode p = new ListNode(-1);
        ListNode cur = head;
        head = p;
        while (cur != null && cur.next != null) {
            stack.push(cur);
            stack.push(cur.next);
            cur = cur.next.next;
            p.next = stack.pop();
            p = p.next;
            p.next = stack.pop();
            p = p.next;
        }
        if (cur != null) {
            p.next = cur;
        } else {
            p.next = null;
        }
        return head.next;
    }
}
