package cn.xiaoyes.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, -2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int rew = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = rew;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
