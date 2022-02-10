package cn.xiaoyes.algorithm.day0210;

public class LeetCode53 {
    public static void main(String[] args) {
        LeetCode53 code = new LeetCode53();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int res = code.maxSubArray2(arr);
        System.out.println(res);
    }

    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = i; j < nums.length; j++) {
                count += nums[j];
                res = Math.max(count, res);
            }
        }
        return res;
    }

    /**
     * 贪心
     *
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int res = Integer.MIN_VALUE;
        int len = nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
            res = Math.max(res, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return res;
    }
}
