package cn.xiaoyes.algorithm.linkedlist;

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
        singleLinkedList.add(node1);
        singleLinkedList.add(node2);
        singleLinkedList.add(node3);
        singleLinkedList.add(node4);

        // 加入按照编号的顺序
//        singleLinkedList.addByOrder(node1);
//        singleLinkedList.addByOrder(node4);
//        singleLinkedList.addByOrder(node2);
//        singleLinkedList.addByOrder(node3);
//        singleLinkedList.addByOrder(node3);

        singleLinkedList.list();
    }

    // 定义SingleLinkedList管理英雄
    static class SingleLinkedList{

        // 初始化一个头节点 不存放具体得数据
        private HeroNode head = new HeroNode(0,"","");

        // 添加节点到单向链表
        // 当不考虑编号得顺序时
        // 找到当前链表得最后节点
        // 将最后这个节点得next指向新得节点
        public void add(HeroNode node){
            // 因为head节点不能动，因此我们需要一个辅助遍历指针
            HeroNode temp = head;
            // 遍历链表 找到最后
            while (true){
                // 找到链表的最后
                if (temp.next == null){
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
        public void addByOrder(HeroNode node){
            // 因为头节点不能动 因此我们仍然同一个辅助变量来帮助我们找到变量的位置
            // 因此我们找的temp时位于添加位置的前一个节点，否则插入不了
            HeroNode temp = head;
            // flag表示添加的编号是否存在 默认为false
            boolean flag = false;
            while (true){
                // 说明temp已经在链表的最后了
                if (temp.next == null){
                    break;
                }
                // 位置就找到了 就在temp的后面插入
                if (temp.next.no > node.no){
                    break;
                }else if (temp.next.no == node.no){// 希望添加的node的编号已经存在
                    flag = true;
                    break;
                }
                temp = temp.next;// 后移 遍历当前的链表
            }
            if (flag){
                // 不能添加 说明编号已经存在
                System.out.println("准备插入的英雄的编号已经存在 不能加入: " + node.no);
            }else {
                // 插入到链表中
                node.next = temp.next;
                temp.next = node;
            }
        }

        // 显示链表[遍历]
        public void list(){
            // 先判断链表是否为空
            if (head.next == null){
                System.out.println("链表为空");
                return;
            }
            // 因为头节点不能动，因此我们需要一个辅助变量来遍历
            HeroNode temp = head.next;
            while (true){
                // 判断是否到最后了
                if (temp == null){
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
    static class HeroNode{

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
