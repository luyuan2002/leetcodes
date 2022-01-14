package cn.xiaoyes.algorithm.day0114;

/**
 * 1470.重新排列数组
 */
public class Simple04 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] list = new int[arr.length];
        int c = 0;
        int rew = arr.length / 2;
        for (int i = 0; i < rew; i++) {
            list[c++] = arr[i];
            list[c++] = arr[rew + i];
        }
        for (int val : list) {
            System.out.print(val + ",");
        }
    }
}
