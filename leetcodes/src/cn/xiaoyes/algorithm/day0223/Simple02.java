package cn.xiaoyes.algorithm.day0223;

// 2.已知int[] arr = {6,9,12,17,91,78,77,64,40}; 求数组中是3个倍数的最小值是多少？
public class Simple02 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 12, 17, 91, 78, 77, 64, 40};
        int[] res = new int[arr.length];
        int idx = 0;
        for (int j : arr) {
            if (j % 3 == 0) res[idx++] = j;
        }
        int min = Integer.MAX_VALUE;
        for (int r : res) {
            if (r != 0) {
                if (r < min) min = r;
            }
        }
        System.out.println(min);
    }
}
