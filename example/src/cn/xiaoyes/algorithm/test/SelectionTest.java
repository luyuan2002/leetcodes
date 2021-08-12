package cn.xiaoyes.algorithm.test;

import cn.xiaoyes.algorithm.sort.Selection;

import java.util.Arrays;

/**
 * 选职责排序测试
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 6, 8, 7, 9, 2, 10, 1};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
