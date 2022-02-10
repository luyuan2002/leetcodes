package cn.xiaoyes.algorithm.day0210;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode45 {
    public static void main(String[] args) {

    }

    public int jump(int[] nums) {
        int len = nums.length;
        int ans = 0;
        boolean[] st = new boolean[len];
        Deque<Integer> q = new ArrayDeque<>();
        st[0] = true;
        q.addLast(0);
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int idx = q.pollFirst();
                if (idx == len - 1) {
                    return ans;
                }
                for (int i = idx + 1; i <= idx + nums[idx] && i < len; i++) {
                    if (!st[i]) {
                        st[i] = true;
                        q.addLast(i);
                    }
                }
            }
            ans++;
        }
        return ans;
    }
}
