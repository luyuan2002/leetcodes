package cn.xiaoyes.algorithm.stack;

public class Calculator {
    public static void main(String[] args) {

        String expression = "7*2*2-5+1-5+3-6";

        /**
         * 数栈
         */
        ArrayStack numStack = new ArrayStack(10);

        /**
         * 运算符栈
         */
        ArrayStack operStack = new ArrayStack(10);

        /**
         * 扫描索引
         */
        int index = 0;
        int n1 = 0;
        int n2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';// 将被次扫描得到的char保存到ch
        String keepNum = "";// 拼接多位数
        // 开始循环while循环的扫描到expression
        while (true) {
            // 以此得到expression的每个字符
            ch = expression.substring(index, index + 1).charAt(0);
            // 判断ch是什么然后做相应的处理
            if (operStack.isOper(ch)) {// 如果是运算符
                // 判断当前符号栈是否为空
                if (!operStack.isEmpty()) {
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        n1 = numStack.pop();
                        n2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(n1, n2, (char) oper);
                        numStack.push(res);
                        operStack.push(ch);
                    } else {
                        operStack.push(ch);
                    }
                } else {
                    // 如果为空直接入符号栈
                    operStack.push(ch);
                }
            } else {// 如果是数则直接入数栈
//                numStack.push(ch - (46 + 2));
                /**
                 * 分析思路
                 * 1、当处理多位数时 不能发现是一个数就立即入栈 因为他可能是多位数
                 * 2、在处理数 需要向expression的表达式的index 后在看一位 如果是数就进行扫描 如果是符号才入栈
                 * 3、因此我们需要定义一个变量 字符串 用于拼接
                 */
                keepNum += ch;
                // 如果ch已经是expression的最后一位 就直接入栈
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(keepNum));
                }else {
                    // 判断下一个字符是不是数字 如果是数字就继续扫描 如果是运算符则入栈
                    // 注意看后一位 不是index++
                    if (operStack.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
                        // 如果后一位是运算符 则入栈
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }
            // 让index + 1 并判断是否扫描到expression最后
            index++;
            if (index >= expression.length()) {
                break;
            }
        }

        // 当表达式扫描完毕 就顺序的从数栈和符号栈中pop出相应的数和符号并运行
        while (true) {
            // 如果符号栈为空 则计算到最后的结果 数栈中只有一个数字[结果]
            if (operStack.isEmpty()) {
                break;
            }
            n1 = numStack.pop();
            n2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(n1, n2, (char) oper);
            numStack.push(res);
        }
        // 将数栈的最后数 pop出 就是结果
        int resp = numStack.pop();
        System.out.println("表达式" + expression + "=" + resp);
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


        /**
         * 返回运算符的优先级 优先级是程序员来确定 优先级使用数字表示
         * 数字越大 优先级越高
         */
        public int priority(int oper) {
            if (oper == '*' || oper == '/') {
                return 1;
            } else if (oper == '+' || oper == '-') {
                return 0;
            } else {
                return -1;// 假设摸钱的表达式中只有 + - * /
            }
        }

        /**
         * 判断是否为运算符
         */
        public boolean isOper(char val) {
            return val == '+' || val == '-' || val == '*' || val == '/';
        }

        /**
         * 计算方法
         */
        public int cal(int n1, int n2, char oper) {
            int res = 0;// 存放计算结果
            switch (oper) {
                case '+':
                    res = n1 + n2;
                    break;
                case '-':
                    res = n2 - n1;// 注意顺序
                    break;
                case '*':
                    res = n1 * n2;
                    break;
                case '/':
                    res = n2 / n1;
                    break;
            }
            return res;
        }

        /**
         * 返回当前栈顶的值 但是不是真正的pop
         */
        public int peek() {
            return stack[top];
        }
    }

}
