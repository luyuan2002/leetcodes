package cn.xiaoyes.algorithm.search;

/**
 * 二分查找算法
 * 需要查找的元素必须是有序的
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 8, 10, 89, 1000, 1234};
        int resIndex = binarySearch(arr, 0, arr.length - 1, 88);
        System.out.println(resIndex);
    }

    /**
     * @param arr     数组
     * @param left    左边的索引
     * @param right   右边的索引
     * @param findVal 查找的值
     * @return 找到就返回下表 没有找到返回-1
     */
    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        // 当left > right时 说明递归整个数组 但是没有找到
        if (left > right){
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (findVal > midVal) {
            // 向右递归
            return binarySearch(arr, mid + 1, right, findVal);
        } else if (findVal < midVal) {
            // 向左递归
            return binarySearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }
    }
}
