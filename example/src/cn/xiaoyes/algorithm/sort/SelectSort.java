package cn.xiaoyes.algorithm.sort;

import java.util.Arrays;

/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        for (int i = 0; i < arr.length -1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = minIndex + 1; j < arr.length; j++) {
                if (min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i){
                arr[minIndex] = arr[0];
                arr[0] = min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
