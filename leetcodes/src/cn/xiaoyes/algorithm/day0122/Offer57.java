package cn.xiaoyes.algorithm.day0122;

import java.util.Arrays;

public class Offer57 {
    public static void main(String[] args) {
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    int[] res = new int[2];
                    res[0] = nums[i];
                    res[1] = nums[j];
                    return res;
                }
            }
        }
        return new int[2];
    }
}
