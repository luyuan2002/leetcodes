package cn.xiaoyes.algorithm.linkedlist;

public class DoubleLinkedListDemo {

    public static void main(String[] args) {
        System.out.println("双向链表的测试");

        HeroNode node1 = new HeroNode(1, "松江", "及时雨");
        HeroNode node2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode node3 = new HeroNode(3, "吴用", "智多星");
        HeroNode node4 = new HeroNode(4, "林冲", "豹子头");

        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);

        linkedList.list();

        System.out.println("修改链表");
        HeroNode heroNode = new HeroNode(4,"公孙胜","入云龙");
        linkedList.update(heroNode);
        linkedList.list();

        System.out.println("删除链表");
        linkedList.delete(4);
        linkedList.list();

    }

    static class DoubleLinkedList{
        private HeroNode head = new HeroNode(0,"","");

        public HeroNode getHead() {
            return head;
        }

        /**
         * 遍历双向链表
         */

        // 显示链表[遍历]
        public void list() {
            // 先判断链表是否为空
            if (head.next == null) {
                System.out.println("链表为空");
                return;
            }
            // 因为头节点不能动，因此我们需要一个辅助变量来遍历
            HeroNode temp = head.next;
            while (true) {
                // 判断是否到最后了
                if (temp == null) {
                    break;
                }
                // 输出节点的信息
                System.out.println(temp);
                // 将temp 后移
                temp = temp.next;
            }
        }

        /**
         * 添加节点到双向链表最后
         * @param node
         */
        public void add(HeroNode node) {
            HeroNode temp = head;
            while (true) {
                if (temp.next == null) {
                    break;
                }
                temp = temp.next;
            }
            // 形成双向链表
            temp.next = node;
            node.pre = temp;
        }

        /**
         * 修改节点
         * @param node
         */
        public void update(HeroNode node) {
            if (head.next == null) {
                System.out.println("链表为空");
                return;
            }
            HeroNode temp = head.next;
            boolean flag = false;
            while (true) {
                if (temp == null) {
                    break;
                }
                if (temp.no == node.no) {
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (flag) {
                temp.name = node.name;
                temp.nickname = node.nickname;
            } else {
                System.out.println("没有找到编号" + node.no + "的节点");
            }
        }


        /**
         * 删除节点
         * @param no
         */
        public void delete(int no) {
            if (head.next == null){
                System.out.println("链表为空 无法删除");
                return;
            }
            HeroNode temp = head.next;

            boolean flag = false;
            while (true) {
                if (temp == null) {
                    break;
                }
                if (temp.no == no) {
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            if (flag) {
                temp.pre.next = temp.next;
                if (temp.next != null){
                    temp.next.pre = temp.pre;
                }
            } else {
                System.out.println("要删除的节点" + no + "不存在");
            }
        }

    }

    static class HeroNode {

        private int no;
        private String name;
        private String nickname;
        private HeroNode next;// 指向下一个节点
        private HeroNode pre;// 指向前一个节点
        public HeroNode(int no, String name, String nickname) {
            this.no = no;
            this.name = name;
            this.nickname = nickname;
        }

        @Override
        public String toString() {
            return "HeroNode{" +
                    "no=" + no +
                    ", name='" + name + '\'' +
                    ", nickname='" + nickname + "}";
        }
    }

}