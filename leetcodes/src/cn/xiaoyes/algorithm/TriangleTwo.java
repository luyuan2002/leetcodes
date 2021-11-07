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
public class TriangleTwo {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < rowIndex; i++) {

        }
    }

}
