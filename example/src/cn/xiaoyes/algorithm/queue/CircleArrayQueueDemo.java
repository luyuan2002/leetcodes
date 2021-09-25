package cn.xiaoyes.algorithm.queue;

import java.util.Scanner;

public class CircleArrayQueueDemo {

    public static void main(String[] args) {
        System.out.println("测试数组模拟环形队列");

        // 创建队列
        CircleArrayQueue arrayQueue = new CircleArrayQueue(4);
        char key = ' ';
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        // 输出一个菜单
        while (loop) {
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列取出数据");
            System.out.println("h(head): 查看队列头数据");
            key = sc.next().charAt(0);
            switch (key) {
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
                        System.out.printf("取出的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = arrayQueue.headQueue();
                        System.out.printf("队列头的数据是%d\n", res);
                    } catch (Exception e) {
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

    static class CircleArrayQueue {

        // 表示数组的最大容量
        private int maxSize;

        // front变量的含义做一个调整：front就指向队列的第一个元素，也就是说arr[front]就是队列的第一个元素，front的初始值 = 0
        private int front;

        // rear变量的含义做一个调整：rear指向队列的最后一个元素的后一个位置，因为希望空出一个空间作为约定，rear的初始值 = 0
        private int rear;

        // 该数组用于存放数据，模拟队列
        private int[] arr;

        public CircleArrayQueue(int maxSize) {
            this.maxSize = maxSize;
            arr = new int[maxSize];
            front = 0;
            rear = 0;
        }

        /**
         * 判断队列是否满了
         *
         * @return
         */
        public boolean isFull() {
            return (rear + 1) % maxSize == front;
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
            // 直接将数据加入
            arr[rear] = n;
            // 将rear后移，这里必须考虑取模
            rear = (rear + 1) % maxSize;
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
            // 这里需要分析出front是指向队列的第一个元素
            // 先把front对应的值保存到一个零食变量
            // 将front后移，考虑取模
            // 将临时保存的变返回
            int value = arr[front];
            front = (front + 1) % maxSize;
            return value;
        }

        /**
         * 显示队列的所有数据
         */
        public void showQueue() {
            // 遍历
            if (isEmpty()) {
                throw new RuntimeException("队列为空，不能取数据");
            }
            // 从front开始遍历，遍历多少个元素
            for (int i = front; i < front + size(); i++) {
                System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
            }
        }

        /**
         * 求出当前队列有效数据的个数
         */
        public int size() {
            // rear = 1
            // front = 0
            // maxSize = 3
            return (rear + maxSize - front) % maxSize;
        }

        /**
         * 显示队列的头数据，并不是去取出数据
         */
        public int headQueue() {
            if (isEmpty()) {
                throw new RuntimeException("队列为空，不能取数据");
            }
            return arr[front];
        }

    }
}
