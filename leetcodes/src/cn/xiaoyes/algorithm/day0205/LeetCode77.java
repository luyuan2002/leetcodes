package cn.xiaoyes.algorithm.day0205;

import java.util.ArrayList;
import java.util.List;

public class LeetCode77 {
    public static void main(String[] args) {
        LeetCode77 code = new LeetCode77();
        List<List<Integer>> res = code.combine(4, 2);
        res.forEach(System.out::println);
    }

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1, new ArrayList<>());
        return res;
    }

    public void backtracking(int n, int k, int start, List<Integer> path) {
        if (k == path.size()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            backtracking(n, k, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
