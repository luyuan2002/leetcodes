package cn.xiaoyes.algorithm.day0212;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode56 {
    public static void main(String[] args) {
        LeetCode56 code = new LeetCode56();
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] res = code.marge(arr);
        for (int[] re : res) {
            System.out.println(Arrays.toString(re));
        }
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        List<int[]> res = new LinkedList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] >= intervals[i][0]) {
                intervals[i][0] = intervals[i - 1][0];
            }
            res.add(intervals[i]);
        }
        int[][] r = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) r[i] = res.get(i);
        return r;
    }

    public int[][] marge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] interval : intervals) {
            if (idx == -1 || interval[0] > res[idx][1]){
                res[++idx] = interval;
            }else {
                res[idx][1] = Math.max(res[idx][1],interval[1]);
            }
        }
        return Arrays.copyOf(res,idx + 1);
    }
}
