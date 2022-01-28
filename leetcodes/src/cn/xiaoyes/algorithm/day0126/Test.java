package cn.xiaoyes.algorithm.day0126;

import cn.xiaoyes.algorithm.domain.ListNode;
import cn.xiaoyes.algorithm.utils.Commons;

public class Test {
    public static void main(String[] args) {
        fun1(Commons.productLikedList(1,2,3,4,5,6));
    }

    public static void fun1(ListNode node){
        if (node == null){
            return;
        }
        fun1(node.next);
        System.out.println(node.val);
    }
}
