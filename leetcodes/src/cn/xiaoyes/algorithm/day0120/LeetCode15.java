package cn.xiaoyes.algorithm.day0120;

import cn.xiaoyes.algorithm.utils.Commons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode15 {
    public static void main(String[] args) {
        System.out.println(threeSum(Commons.productArray(-1, 0, 1, 2, -1, -4)));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int ni = nums[i],nj = nums[j],nk = nums[k];
                    if (ni + nj + nk == 0){
                        res.add(new ArrayList<>(Arrays.asList(ni,nj,nk)));
                    }
                }
            }
        }
        return res;
    }
}
