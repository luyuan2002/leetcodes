package cn.xiaoyes.algorithm.day0224;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

import java.util.Stack;

public class Offer24 {
    public static void main(String[] args) {
        Offer24 offer = new Offer24();
        Integer[] data = {1, 2, 3, 4, 5};
        ListNode res = offer.reverseList2(Commons.productLikedList(data));
        Commons.iterationLikedList(res);
    }

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode root = new ListNode(-1);
        ListNode cur = head;
        while (cur != null){
            stack.push(new ListNode(cur.val));
            cur = cur.next;
        }
        cur = root;
        while (!stack.isEmpty()){
            cur.next = stack.pop();
            cur = cur.next;
        }
        return root.next;
    }

    ListNode root = new ListNode( -1);
    ListNode cur = root;
    public ListNode reverseList2(ListNode head) {
        recursion(head);
        return root.next;
    }

    public void recursion(ListNode head){
        if (head == null){
            return;
        }
        recursion(head.next);
        cur.next = new ListNode(head.val);
        cur = cur.next;
    }
}
