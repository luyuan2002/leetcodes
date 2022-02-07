package cn.xiaoyes.algorithm.day0207;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {
    public static void main(String[] args) {
        LeetCode46 code = new LeetCode46();
        int[] arr = {1, 2, 3};
        List<List<Integer>> res = code.permute(arr);
        res.forEach(System.out::println);
    }

    List<List<Integer>> res = new ArrayList<>();

    List<Integer> path = new ArrayList<>();

    boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtracking(nums);
        return res;
    }

    public void backtracking(int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            path.add(nums[i]);
            backtracking(nums);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
