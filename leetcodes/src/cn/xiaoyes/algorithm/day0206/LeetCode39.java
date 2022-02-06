package cn.xiaoyes.algorithm.day0206;

import java.util.*;

public class LeetCode39 {
    public static void main(String[] args) {
        LeetCode39 code = new LeetCode39();
        int[] arr = {2, 3, 6, 7};
        List<List<Integer>> res = code.combinationSum(arr, 7);
        res.forEach(System.out::println);
    }

    List<List<Integer>> res = new ArrayList<>();

    /**
     * 普通回溯
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0, 0, new ArrayList<>());
        return res;
    }

    public void backtrack(int[] candidates, int target, int start, int sum, List<Integer> path) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            path.add(candidates[i]);
            backtrack(candidates, target, i, sum + candidates[i], path);
            path.remove(path.size() - 1);
        }
    }

    /**
     * 减法过程回溯
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        dfs(candidates, 0, len, target, new ArrayDeque<>(), res);
        return res;
    }

    public void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);
            dfs(candidates, i, len, target - candidates[i], path, res);
            path.removeLast();
        }
    }


    /**
     * 回溯+剪枝
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum3(int[] candidates, int target) {
        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        Arrays.sort(candidates);
        dfs2(candidates, 0, len, target, new ArrayDeque<>(), res);
        return res;
    }

    public void dfs2(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            if (target - candidates[i] < 0) {
                break;
            }
            path.addLast(candidates[i]);
            dfs2(candidates, i, len, target - candidates[i], path, res);
            path.removeLast();
        }
    }


}
