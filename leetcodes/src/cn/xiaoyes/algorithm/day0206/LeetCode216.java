package cn.xiaoyes.algorithm.day0206;

import java.util.ArrayList;
import java.util.List;

public class LeetCode216 {
    public static void main(String[] args) {
        LeetCode216 code = new LeetCode216();
        List<List<Integer>> res = code.combinationSum3(3, 9);
        res.forEach(System.out::println);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(n, k, 1, 0, res, new ArrayList<>());
        return res;
    }

    /**
     * 组合总和
     * @param n 总和
     * @param k 个数
     * @param start 开始索引
     * @param sum 当前和
     * @param res 总集合
     * @param path 递归集合
     */
    public void backtrack(int n, int k, int start, int sum, List<List<Integer>> res, List<Integer> path) {
        if (n == sum && path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; (k - path.size() <= 9 - i + 1) && (sum + i <= n); i++) {
            path.add(i);
//            System.out.println(path);
            backtrack(n, k, i + 1, sum + i, res, path);
            path.remove(path.size() - 1);
        }
    }
}
