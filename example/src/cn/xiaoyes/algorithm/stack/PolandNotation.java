package cn.xiaoyes.algorithm.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 逆波兰表达式
 */
public class PolandNotation {
    public static void main(String[] args) {

        /**
         * 将中缀表达式转后缀表达式
         * 1、1 + ((2 + 3) * 4) - 5 => 1 2 3 + 4 * + 5 -
         * 2、因为直接对字符串进行操作不方便，因此先将 “1 + ((2 + 3) * 4) - 5” 转成中缀表达式对应的List
         * 即1 + ((2 + 3) * 4) - 5 => ArrayList [1,+,(,(,2,+,,3,),*,4,),-,5]
         * 3、将得到的中缀表达式对应的List转换为后缀表达式对应的List
         *
         */
        String infixExpression = "1+((2+3)*4)-5";
        List<String> strings = toInfixExpression(infixExpression);
        System.out.println("中缀表达式 => " + strings);
        List<String> suffixExpressionList = parseSuffixExpressionList(strings);
        System.out.println("后缀表达式 => " + suffixExpressionList);

        System.out.println("expression=" + calculate(suffixExpressionList));
        // 定义逆波兰表达式
        // (3 + 4) * 5 - 6 => 3 4 + 5 * 6 -
        // 为了方便 逆波兰表达式的数字和符号用空格隔开
        String suffixExpression = "3 4 + 5 * 6 -";
        /**
         * 1、先将 "3 4 + 5 * 6 -" 放入ArrayList中
         * 2、将ArrayList传递给一个方法 遍历ArrayList配合栈完成计算
         */

        /*List<String> rpnList = getListString(suffixExpression);
        System.out.println(rpnList);
        System.out.println(calculate(rpnList));*/
    }

    /**
     * 将逆波兰表达式 依次将数据和运算符放入到ArrayList中
     * @param suffixExpression
     * @return
     */
    public static List<String> getListString(String suffixExpression){
        String[] split = suffixExpression.split(" ");
        List<String> list = new ArrayList<>();
        for (String e : split) {
            list.add(e);
        }
        return list;
    }
    /**
     * 完成对逆波兰表达式的运算
     */
    public static int calculate(List<String> data){
        // 创建栈
        Stack<String> stack = new Stack<>();
        // 遍历List
        for (String item : data) {
            // 使用正则表达式来取出数
            if (item.matches("\\d+")){// 匹配多位数
                // 入栈
                stack.push(item);
            }else {
                // 运算符
                // pop出栈顶和次顶元素并运算 在入栈
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                switch (item) {
                    case "+":
                        res = num1 + num2;
                        break;
                    case "-":
                        res = num1 - num2;
                        break;
                    case "*":
                        res = num1 * num2;
                        break;
                    case "/":
                        res = num1 / num2;
                        break;
                    default:
                        throw new RuntimeException("运算符有误");
                }
                // 把res入栈
                stack.push(res + "");
            }

        }
        // 最后留在stack栈顶的就是运算结果
        return Integer.parseInt(stack.pop());
    }


    /**
     * 将中缀表达式转换成对应的List
     */
    public static List<String> toInfixExpression(String val){
        List<String> data = new ArrayList<>();
        // 索引 用于遍历中缀表达式字符串
        int i = 0;
        // 做对多位数的拼接
        String str = "";
        // 每遍历到一个字符就放入c中
        char c;
        do {
            // 如果c是一个非数字 我们就需要加入到data中
            if ((c = val.charAt(i)) < (46 + 2) || (c = val.charAt(i)) > 57){
                data.add("" + c);
                i++;
            }else {
                // 如果是一个数就要考虑多位数的问题
                str = "";
                while (i < val.length() && (c = val.charAt(i)) >= 48 && (c = val.charAt(i)) <= 57){
                    str += c;
                    i++;
                }
                data.add(str);
            }
        }while (i < val.length());
        return data;
    }


    /**
     * 将得到的中缀表达式对应的List转换为后缀表达式对应的List
     */
    public static List<String> parseSuffixExpressionList(List<String> data){
        // 定义两个栈
        Stack<String> s1 = new Stack<>();// 符号栈
        // 因为s2栈在整个转换过程中没有pop的操作，而且后面我们还需要逆序输出，所以直接替换为List
//        Stack<String> s2 = new Stack<>();
        List<String> s2 = new ArrayList<>();// 储存中间结果的栈
        // 遍历data
        for (String item : data) {
            // 如果是一个数 就加入到s2
            if (item.matches("\\d+")){
                s2.add(item);
            }else if (item.equals("(")){
                s1.push(item);
            }else if (item.equals(")")){
                while (!s1.peek().equals("(")){
                    s2.add(s1.pop());
                }
                // 将(弹出s1栈 消除小括号
                s1.pop();
            }else {
                while (s1.size() != 0 && Operation.getValue(s1.peek()) >= Operation.getValue(item)){
                    s2.add(s1.pop());
                }
                // 将item压入栈中
                s1.push(item);
            }
        }
        while (s1.size() != 0){
            s2.add(s1.pop());
        }
        return s2;// 因为是存放到List中 因此按顺序输出就是 对应的后缀表达式
    }

    static class Operation{

        private static int ADD = 1;

        private static int SUB = 1;

        private static int MUL = 2;

        private static int DIV = 2;

        // 返回对应优先级的数字
        public static int getValue(String operation){
            int result = 0;
            switch (operation){
                case "+":
                    result = ADD;
                    break;
                case "-":
                    result = SUB;
                    break;
                case "*":
                    result = MUL;
                    break;
                case "/":
                    result = DIV;
                    break;
                default:
                    System.out.println("不存在该运算符");
                    break;
            }
            return result;
        }
    }
}
