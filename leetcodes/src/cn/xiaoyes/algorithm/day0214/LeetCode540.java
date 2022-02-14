package cn.xiaoyes.algorithm.day0214;

import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode540 {
    public static void main(String[] args) {
        int res = singleNonDuplicate(Commons.productArray(1, 1, 2, 3, 3, 4, 4, 8, 8));
        System.out.println(res);
    }
    public static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i += 2) {
            if (nums[i] != nums[i + 1]){
                return nums[i];
            }
        }
        return nums[n - 1];
    }

    public int singleNonDuplicate2(int[] nums) {
        int ans = 0;
        for (int i : nums) ans ^= i;
        return ans;
    }
}
