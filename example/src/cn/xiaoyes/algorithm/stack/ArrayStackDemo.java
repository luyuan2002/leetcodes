package cn.xiaoyes.algorithm.stack;

import java.util.Scanner;

/**
 * 数组模拟栈
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        String key = "";
        boolean loop = true;// 控制是否退出菜单
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
                    stack.push(n);
                    break;
                case "pop":
                    int pop = stack.pop();
                    System.out.println("出栈的数据: " + pop);
                    break;
            }
        }
        System.out.println("程序退出");
    }

    static class ArrayStack {

        /**
         * 栈的大小
         */
        private int maxSize;

        /**
         * 数组(存放栈的数据)
         */
        private int[] stack;

        /**
         * 栈顶(初始化为-1)
         */
        private int top = -1;

        public ArrayStack(int maxSize) {
            this.maxSize = maxSize;
            stack = new int[this.maxSize];
        }

        /**
         * 判断栈是否满了
         *
         * @return
         */
        public boolean isFull() {
            return top == maxSize - 1;
        }

        /**
         * 判断栈是否为空
         *
         * @return
         */
        public boolean isEmpty() {
            return top == -1;
        }

        /**
         * 入栈
         *
         * @param val
         */
        public void push(int val) {
            /* 判断栈是否满 */
            if (isFull()) {
                System.out.println("栈满");
                return;
            }
            top++;
            stack[top] = val;
        }

        /**
         * 出栈(将栈顶的数据返回)
         *
         * @return
         */
        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("栈空");
            }
            return stack[top--];
        }

        /**
         * 遍历栈(需要从栈顶开始显示数据)
         */
        public void list() {
            if (isEmpty()) {
                System.out.println("栈空 没有数据");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.printf("stack[%d]=%d\n", i, stack[i]);
            }
        }
    }
}
