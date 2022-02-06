package cn.xiaoyes.algorithm.day0206;

import java.util.Arrays;

public class LeetCode1748 {
    public static void main(String[] args) {
        LeetCode1748 code = new LeetCode1748();
        int result = code.sumOfUnique(new int[]{1, 2, 3, 2});
        System.out.println(result);
    }

    int[] res = new int[110];

    /**
     * 数组模拟哈希表
     * @param nums
     * @return
     */
    public int sumOfUnique(int[] nums) {
        for (int i : nums) {
            res[i]++;
        }
        int ans = 0;
        for (int i = 1; i <= 100; i++) {
            if (res[i] == 1) {
                ans += i;
            }
        }
        return ans;
    }

    /**
     * 排序+双指针
     * @param nums
     * @return
     */
    public int sumOfUnique2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, res = 0;
        for (int i = 0; i < n; ) {
            int j = i;
            while (j < n && nums[j] == nums[i]) {
                j++;
            }
            if (j - i == 1) {
                res += nums[i];
                i = j;
            }
        }
        return res;
    }
}
