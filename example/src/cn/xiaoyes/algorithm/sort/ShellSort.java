package cn.xiaoyes.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        shellSort(arr);
    }

    public static void shellSort(int[] arr) {
        int temp = 0;
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            // 将10个数据分成了2组
            for (int i = gap; i < arr.length; i++) {
                // 遍历各组中的所有元素(共5组 每组有2个元素)
                for (int j = i - gap; j >= 0; j -= gap) {
                    // 如果当前元素大于加上步长后的哪个元素 说明交换
                    if (arr[j] > arr[j + gap]) {
                        temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
