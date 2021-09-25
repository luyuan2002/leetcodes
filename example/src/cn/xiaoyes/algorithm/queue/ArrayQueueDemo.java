package cn.xiaoyes.algorithm.queue;

import java.util.Scanner;

/**
 * 使用数组模拟队列
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        // 创建队列
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        // 输出一个菜单
        while (loop){
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头数据");
            key = sc.next().charAt(0);
            switch (key){
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = sc.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = arrayQueue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = arrayQueue.headQueue();
                        System.out.printf("队列头的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    sc.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }


    static class ArrayQueue {

        // 表示数组的最大容量
        private int maxSize;

        // 队列头
        private int front;

        // 队列尾
        private int rear;

        // 该数组用于存放数据，模拟队列
        private int[] arr;

        // 创建队列的构造器
        public ArrayQueue(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
            front = -1;// 指向队列头部，分析出front是指向队列头部的前一个位置
            rear = -1;// 指向队列尾部，指向队列尾的数据
        }

        /**
         * 判断队列是否满了
         *
         * @return
         */
        public boolean isFull() {
            return rear == maxSize - 1;
        }

        /**
         * 判断对垒是否为空
         *
         * @return
         */
        public boolean isEmpty() {
            return front == rear;
        }

        /**
         * 添加数据进队列
         *
         * @param n
         * @return
         */
        public void addQueue(int n) {
            // 判断队列是否满了
            if (isFull()) {
                System.out.println("队列满，不能加入数据");
                return;
            }
            // rear后移
            rear++;
            arr[rear] = n;
        }

        /**
         * 获取队列的数据，出队列
         *
         * @return
         */
        public int getQueue() {
            // 判断队列是否为空
            if (isEmpty()) {
                // 抛出异常
                throw new RuntimeException("队列为空，不能取数据");
            }
            front++;// front后移
            return arr[front];
        }

        /**
         * 显示队列的所有数据
         */
        public void showQueue() {
            // 遍历
            if (isEmpty()) {
                throw new RuntimeException("队列为空，不能取数据");
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("arr[%d]=%d\n", i, arr[i]);
            }
        }

        /**
         * 显示队列的头数据，并不是去取出数据
         */
        public int headQueue() {
            if (isEmpty()) {
                throw new RuntimeException("队列为空，不能取数据");
            }
            return arr[front + 1];
        }
    }
}
