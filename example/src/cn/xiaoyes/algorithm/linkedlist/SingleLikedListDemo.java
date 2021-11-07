package cn.xiaoyes.algorithm.linkedlist;

import java.util.Stack;

/**
 * 模拟单链表
 */
public class SingleLikedListDemo {
    public static void main(String[] args) {

        HeroNode node1 = new HeroNode(1, "松江", "及时雨");
        HeroNode node2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode node3 = new HeroNode(3, "吴用", "智多星");
        HeroNode node4 = new HeroNode(4, "林冲", "豹子头");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.add(node1);
//        singleLinkedList.add(node2);
//        singleLinkedList.add(node3);
//        singleLinkedList.add(node4);

        // 加入按照编号的顺序
        singleLinkedList.addByOrder(node1);
        singleLinkedList.addByOrder(node4);
        singleLinkedList.addByOrder(node2);
        singleLinkedList.addByOrder(node3);
        singleLinkedList.addByOrder(node3);

        // 测试修改节点的代码
        singleLinkedList.list();
        HeroNode newHeroNode = new HeroNode(2, "小鹿", "玉麒麟");
        singleLinkedList.update(newHeroNode);
        System.out.println("修改后的链表");
        singleLinkedList.list();

        System.out.println("删除后的链表");
        // 测试删除节点的代码
        singleLinkedList.delete(3);
        singleLinkedList.list();

        // 测试单链表的有效个数
        System.out.println(getLength(singleLinkedList.getHead()));

        System.out.println(findLastNode(singleLinkedList.head, 2));

        reverseList(singleLinkedList.head);
        System.out.println("反转后的链表");
        singleLinkedList.list();
        System.out.println("逆序打印: ");
        reverseStack(singleLinkedList.head);
    }

    /**
     * 获取到单链表的节点个数(如果是带头节点的链表 需求不统计节点数)
     *
     * @param node
     * @return
     */
    public static int getLength(HeroNode node) {
        if (node.next == null) {
            return 0;
        }
        int length = 0;
        HeroNode cur = node.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }


    /**
     * 查找单链表的倒数第k个节点
     * 1、编写一个方法接收head节点 同时接收index
     * 2、index表示是倒数第index个节点
     * 3、先把链表从头到尾遍历，获取到链表的总长度getLength
     * 4、得到size后 我们从链表的第一个开始遍历(size - index)个 就可以得到
     * 5、如果找到返回该节点 找不到返回null
     */
    public static HeroNode findLastNode(HeroNode head, int index) {
        // 如果链表为空 返回null
        if (head.next == null) {
            return null;
        }
        // 第一次遍历得到链表的长度(节点个数)
        int size = getLength(head);
        // 第二次遍历size - index位置 就是倒数第k个节点
        // 先做一个index校验
        if (index <= 0 || index > size) {
            return null;
        }
        // 定义辅助变量
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /**
     * 将单链表进行反转
     * @param head
     * @return
     */
    public static void reverseList(HeroNode head){
        // 如果当前链表为空 或者只有一个节点 无需反转 直接返回
        if (head.next == null || head.next.next == null){
            return ;
        }
        // 定义一个辅助指针(变量) 帮助我们遍历原来的链表
        HeroNode cur = head.next;
        HeroNode next = null;// 指向当前节点[cur]的下一个节点
        HeroNode reverseHead = new HeroNode(0,"","");
        // 遍历原来的链表 每遍历一个节点 就将其取出 并放在心的链表reverseHead的最前端
        while (cur != null){
            // 先暂时保存当前节点的下一个节点 因为之后要使用
            next = cur.next;
            // 将cur的下一个节点指向新的链表的最前端
            cur.next = reverseHead.next;
            reverseHead.next = cur;// 将cur连接到新的链表
            cur = next;// 让cur后移
        }
        // 将head.next指向reverseHead.next
        head.next = reverseHead.next;
    }

    /**
     * 逆序打印单链表(使用栈 先进后出 后进先出)
     *
     */
    public static void reverseStack(HeroNode head){
        if (head.next == null){
            return;
        }
        // 创建一个栈 将各个各个节点存放到栈中
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while (cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        // 将栈中的节点进行打印
        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }

    // 定义SingleLinkedList管理英雄
    static class SingleLinkedList {

        // 初始化一个头节点 不存放具体得数据
        private HeroNode head = new HeroNode(0, "", "");

        public HeroNode getHead() {
            return head;
        }


        // 添加节点到单向链表
        // 当不考虑编号得顺序时
        // 找到当前链表得最后节点
        // 将最后这个节点得next指向新得节点
        public void add(HeroNode node) {
            // 因为head节点不能动，因此我们需要一个辅助遍历指针
            HeroNode temp = head;
            // 遍历链表 找到最后
            while (true) {
                // 找到链表的最后
                if (temp.next == null) {
                    break;
                }
                // 如果没有找到最后 就将temp后移
                temp = temp.next;
            }
            // 当退出while循环时，temp就指向了链表的最后
            temp.next = node;
        }

        // 第二种方式在添加英雄时，根据排名建英雄插入到指定位置
        // 如果有这个排名 则添加失败 并且给出提示
        public void addByOrder(HeroNode node) {
            // 因为头节点不能动 因此我们仍然同一个辅助变量来帮助我们找到变量的位置
            // 因此我们找的temp时位于添加位置的前一个节点，否则插入不了
            HeroNode temp = head;
            // flag表示添加的编号是否存在 默认为false
            boolean flag = false;
            while (true) {
                // 说明temp已经在链表的最后了
                if (temp.next == null) {
                    break;
                }
                // 位置就找到了 就在temp的后面插入
                if (temp.next.no > node.no) {
                    break;
                } else if (temp.next.no == node.no) {// 希望添加的node的编号已经存在
                    flag = true;
                    break;
                }
                temp = temp.next;// 后移 遍历当前的链表
            }
            if (flag) {
                // 不能添加 说明编号已经存在
                System.out.println("准备插入的英雄的编号已经存在 不能加入: " + node.no);
            } else {
                // 插入到链表中
                node.next = temp.next;
                temp.next = node;
            }
        }

        // 修改节点得信息，根据no编号来修改，即no编号不能修改
        // 根据node得no来修改
        public void update(HeroNode node) {
            // 判断是否为空
            if (head.next == null) {
                System.out.println("链表为空");
                return;
            }
            // 找到需要修改得节点，根据no编号来找
            HeroNode temp = head.next;
            boolean flag = false;
            while (true) {
                if (temp == null) {
                    break;// 到链表的最后 跳出循环
                }
                if (temp.no == node.no) {
                    // 找到节点
                    flag = true;
                    break;
                }
                temp = temp.next;
            }
            // 根据flag判断是否找到要修改的节点
            if (flag) {
                temp.name = node.name;
                temp.nickname = node.nickname;
            } else {
                // 没有找到节点
                System.out.println("没有找到编号" + node.no + "的节点");
            }
        }

        // 删除节点
        // head节点不能动 因此我们需要一个temp复制节点找到待删除节点的前一个节点
        // 说明我们在比较时，是temp.next.no和需要删除的节点的no比较
        public void delete(int no) {
            HeroNode temp = head;
            boolean flag = false;// 标志是否找到
            while (true) {
                if (temp.next == null) {// 已经到链表的最后
                    break;
                }
                if (temp.next.no == no) {
                    // 找到哦了待删除节点的前一个节点
                    flag = true;
                    break;
                }
                temp = temp.next;// temp后移 遍历
            }
            if (flag) {
                temp.next = temp.next.next;
            } else {
                System.out.println("要删除的节点" + no + "不存在");
            }
        }

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
    }

    // 每一个HeroNode对象就是一个节点
    static class HeroNode {

        private int no;
        private String name;
        private String nickname;
        private HeroNode next;

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
