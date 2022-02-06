package cn.xiaoyes.algorithm.day0206;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode40 {
    public static void main(String[] args) {
        LeetCode40 code = new LeetCode40();
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> res = code.combinationSum2(arr, target);
        res.forEach(System.out::println);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, 0, new ArrayList<>(), res, used);
        return res;
    }

    public void backtrack(int[] candidates, int target, int begin, int sum, List<Integer> path, List<List<Integer>> res, boolean[] used) {
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < candidates.length && sum + candidates[i] <= target; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }
            sum += candidates[i];
            path.add(candidates[i]);
            used[i] = true;
            System.out.println("递归之前 => i = " + i + " path = " + path);
            backtrack(candidates, target, i + 1, sum, path, res, used);
            System.out.println("递归之后 => i = " + i + " path = " + path);
            sum -= candidates[i];
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
