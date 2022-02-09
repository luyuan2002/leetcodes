package cn.xiaoyes.algorithm.day0209;

public class LeetCode376 {
    public static void main(String[] args) {

    }

    public int wiggleMaxLength(int[] nums) {
        int count = 1;
        int pre = 0;
        int cur = 0;
        if (nums.length < 2) {
            return count;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            cur = nums[i + 1] - nums[i];
            if ((cur > 0 && pre <= 0) || (pre >= 0 && cur < 0)) {
                pre = cur;
                count++;
            }
        }
        return count;
    }
}
