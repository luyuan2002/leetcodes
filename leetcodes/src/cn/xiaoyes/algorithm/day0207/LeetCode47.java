package cn.xiaoyes.algorithm.day0207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode47 {
    public static void main(String[] args) {
        LeetCode47 code = new LeetCode47();
        int[] arr = {1, 1, 2};
        List<List<Integer>> res = code.permuteUnique(arr);
        res.forEach(System.out::println);
    }

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums, used);
        return res;
    }

    public void backtracking(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            if (!used[i]) {
                used[i] = true;
                path.add(nums[i]);
                backtracking(nums, used);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}
