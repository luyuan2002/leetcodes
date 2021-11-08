package cn.xiaoyes.algorithm.linkedlist;

/**
 * 约瑟夫
 */
public class Josepfu {
    public static void main(String[] args) {

        CircleSingleLinkedList linkedList = new CircleSingleLinkedList();
        linkedList.addBoy(125);
        linkedList.showBoy();
        linkedList.countBoy(1,2,125);
    }

    static class CircleSingleLinkedList{
        // 创建first节点 当前没有编号
        private Boy first = new Boy(-1);

        // 添加小孩节点 构建成环形列表
        public void addBoy(int nums){
            // nums 做数据校验
            if (nums < 1){
                System.out.println("nums的值不正确");
                return;
            }
            // 赋值变量 帮助构建链表
            Boy curBoy = null;
            // 使用for循环创建环形链表
            for (int i = 1; i <= nums; i++){
                // 根据编号创建小孩节点
                Boy boy = new Boy(i);
                // 如果是第一个小孩
                if (i == 1){
                    first = boy;
                    first.setNext(first);
                    curBoy = first;// 让curBoy指向第一个小孩
                }else {
                    curBoy.setNext(boy);
                    boy.setNext(first);
                    curBoy = boy;
                }
            }
        }

        // 循环遍历当前的环形链表
        public void showBoy(){
            if (first == null){
                System.out.println("没有任何小孩");
                return;
            }
            // 因为first不能动 因此我们使用辅助指针完成遍历
            Boy curBoy = first;
            while (true){
                System.out.printf("小孩的编号 %d \n",curBoy.getNo());
                if (curBoy.getNext() == first){
                     break;
                }
                curBoy = curBoy.getNext();// curBoy后移
            }
        }


        /**
         * 根据用户的输入计算小孩出圈的顺序
         * @param startNo    表示从第几个小孩开始数数
         * @param countNum   表示数几下
         * @param nums       表示最初有多少小孩在圈中
         */
        public void countBoy(int startNo,int countNum,int nums){
            if (first == null || startNo < 1 || startNo > nums){
                System.out.println("参数输入有误");
                return;
            }
            // 创建辅助指针 帮助完成小孩出圈
            // 创建辅助变量(helper) 事先应该指向环形链表的最后这个节点
            Boy helper = first;
            while (true){
                if (helper.getNext() == first){
                    break;
                }
                helper = helper.getNext();

            }
            // 小孩报数前 先让first和helper移动k -1次
            for (int i = 0; i < startNo - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            // 当小孩报数时 让first和helper指针同时的移动m - 1次 然后出圈
            // 这里是一个循环操作 知道圈中只有一个节点
            while (true){
                if (helper == first){// 说明圈中只有一个节点
                    break;
                }
                for (int i = 0; i < countNum - 1; i++) {
                    first = first.getNext();
                    helper = helper.getNext();
                }
                // 这时first指向的节点 就是要出圈的小孩
                System.out.printf("小孩%d出圈\n",first.getNo());
                // 这时将first指向的小孩出圈
                first = first.getNext();
                helper.setNext(first);
            }
            System.out.printf("最后留在圈中的小孩编号%d \n",helper.getNo());
        }
    }

    static class Boy{
        private int no;
        private Boy next;
        public Boy(int no) {
            this.no = no;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public Boy getNext() {
            return next;
        }

        public void setNext(Boy next) {
            this.next = next;
        }
    }
}
