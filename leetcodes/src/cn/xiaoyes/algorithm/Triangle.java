package cn.xiaoyes.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 118.杨辉三角
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
 * <p>
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例 1:
 * 输入: numRows = 5
 * 输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * 示例2:
 * 输入: numRows = 1
 * 输出: [[1]]
 * <p>
 * 提示:
 * <p>
 * 1 <= numRows <= 30
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> numbers = new ArrayList<>();
            for (int column = 0; column <= row; column++) {
                if (column == 0 || column == row) {
                    numbers.add(1);
                } else {
                    numbers.add(triangle.get(row - 1).get(column - 1) + triangle.get(row - 1).get(column));
                }
            }
            triangle.add(numbers);
        }
        return triangle;
    }
}
