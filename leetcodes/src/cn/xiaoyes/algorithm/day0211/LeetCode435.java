package cn.xiaoyes.algorithm.day0211;

import java.util.Arrays;

public class LeetCode435 {
    public static void main(String[] args) {
        LeetCode435 code = new LeetCode435();
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int res = code.eraseOverlapIntervals(arr);
        System.out.println(res);
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int len = intervals.length;
        int count = 1;
        int end = intervals[0][1];
        for (int i = 1; i < len; i++) {
            if (intervals[i][0] >= end) {
                count++;
                end = intervals[i][1];
            }
        }
        return len - count;
    }

}
