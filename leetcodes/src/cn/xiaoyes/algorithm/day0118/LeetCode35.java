package cn.xiaoyes.algorithm.day0118;

public class LeetCode35 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 4));
    }

    /**
     * 搜索插入的位置
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (nums[len - 1] < target) {
            return len;
        }
        int left = 0;
        int right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }


    /*public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }*/
}
