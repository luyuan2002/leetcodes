package cn.xiaoyes.algorithm.day0207;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode90 {

    public static void main(String[] args) {
        LeetCode90 code = new LeetCode90();
        int[] arr = {1, 2, 2};
        List<List<Integer>> res = code.subsetsWithDup(arr);
        res.forEach(System.out::println);
    }

    List<List<Integer>> res = new ArrayList<>();
    boolean[] used;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>());
        return res;
    }

    public void backtrack(int[] nums, int begin, List<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i = begin; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]){
                continue;
            }
            path.add(nums[i]);
            used[i] = true;
            backtrack(nums, i + 1, path);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}
