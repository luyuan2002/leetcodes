package cn.xiaoyes.algorithm.stack;

import java.util.Scanner;

/**
 * 链表模拟栈
 */
public class LinkedStackDemo {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        String key = "";
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.println("show: 显示栈");
            System.out.println("exit: 退出程序");
            System.out.println("push: 入栈");
            System.out.println("pop: 出栈");
            key = sc.next();
            switch (key) {
                case "show":
                    stack.list();
                    break;
                case "exit":
                    sc.close();
                    loop = false;
                    break;
                case "push":
                    System.out.println("请输入一个数: ");
                    int n = sc.nextInt();
                    stack.push(new LinkedStack.Node(n));
                    break;
                case "pop":
                    int pop = stack.pop();
                    System.out.println("出栈的数据: " + pop);
                    break;
            }
        }
        System.out.println("程序退出");

    }

    static class LinkedStack {

        private Node top;

        public LinkedStack() {
            top = new Node(-1);
        }

        /**
         * 判断栈是否为空
         * @return
         */
        public boolean isEmpty(){
            return top.data == -1;
        }

        /**
         * 入栈
         * @param node
         */
        public void push(Node node){
            if(top.next == null){
                top.next = node;
                return;
            }
            /**
             * 先获取top.next
             * 然后把node插入到top和top.next中间
             */
            Node cur = top.next;
            top.next = node;
            node.next = cur;
        }

        /**
         * 出栈
         */
        public int pop(){
            int val = top.next.data;
            top = top.next;
            return val;
        }

        /**
         * 遍历栈
         */
        public void list(){
            if (top.next == null){
                System.out.println("栈空");
                return;
            }
            Node temp = top;
            while (temp.next != null){
                System.out.println("[" + temp.next.data + "]");
                temp = temp.next;
            }
        }

        /**
         * 节点
         */
        static class Node {
            int data;
            Node next;
            public Node(int data) {
                this.data = data;
            }
        }
    }
}
