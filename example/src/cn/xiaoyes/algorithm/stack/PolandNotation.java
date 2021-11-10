package cn.xiaoyes.algorithm.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 逆波兰表达式
 */
public class PolandNotation {
    public static void main(String[] args) {

        // 定义逆波兰表达式
        // (3 + 4) * 5 - 6 => 3 4 + 5 * 6 -
        // 为了方便 逆波兰表达式的数字和符号用空格隔开
        String suffixExpression = "3 4 + 5 * 6 -";
        /**
         * 1、先将 "3 4 + 5 * 6 -" 放入ArrayList中
         * 2、将ArrayList传递给一个方法 遍历ArrayList配合栈完成计算
         */

        List<String> rpnList = getListString(suffixExpression);
        System.out.println(rpnList);
        System.out.println(calculate(rpnList));
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
}
