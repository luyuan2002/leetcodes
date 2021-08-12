package cn.xiaoyes.algorithm.test;

import cn.xiaoyes.algorithm.sort.Bubble;

import java.util.Arrays;

/**
 * 冒泡排序测试
 */
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {4, 5, 6, 3, 2, 1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
