package cn.xiaoyes.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        for (int i = 1; i < arr.length; i++) {
            // 定义待插入的数
            int insertVal = arr[i];
            int insertIndex = i - 1;// arr[1]前面这个数的下表
            // 给insertVal找到插入的位置
            // insertIndex >= 0 保证不越界
            // insertVal < arr[insertIndex] 待插入的数 还没有找到插入位置
            // 就需要将insertIndex后移
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            // 当退出while循环时 说明插入的位置找到 insertIndex + 1
            arr[insertIndex + 1] = insertVal;
        }
        System.out.println(Arrays.toString(arr));
    }
}
