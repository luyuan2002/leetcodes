package cn.xiaoyes.algorithm.day0210;

public class LeetCode55 {
    public static void main(String[] args) {
        LeetCode55 code = new LeetCode55();
        boolean b = code.canJump(new int[]{2, 3, 1, 1, 4});
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        int coverRange = 0;
        for (int i = 0; i <= coverRange; i++) {
            coverRange = Math.max(coverRange, i + nums[i]);
            if (coverRange >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
