package cn.xiaoyes.algorithm.day0207;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LeetCode78 {
    public static void main(String[] args) {
        LeetCode78 code = new LeetCode78();
        int[] arr = {1,2,3};
        List<List<Integer>> res = code.subsets(arr);
        res.forEach(System.out::println);
    }


    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0,new LinkedList<>());
        return res;
    }

    public void backtrack(int[] nums, int begin, Deque<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i = begin; i < nums.length; i++) {
            path.addLast(nums[i]);
            backtrack(nums, i + 1, path);
            path.removeLast();
        }
    }
}
