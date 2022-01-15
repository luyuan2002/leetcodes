package cn.xiaoyes.algorithm.search;

public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 34, 5, 647, 7567};
        System.out.println(seqSearch(arr, 5));
    }

    /**
     * 找到一个满足条件的值就返回
     *
     * @param data   数据
     * @param target 目标
     * @return 下标
     */
    public static int seqSearch(int[] data, int target) {
        // 线性查找逐一查找
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
