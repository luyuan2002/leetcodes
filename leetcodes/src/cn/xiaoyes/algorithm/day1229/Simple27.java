package cn.xiaoyes.algorithm.day1229;

public class Simple27 {
    public static void main(String[] args) {
        Simple27 simple = new Simple27();
        System.out.println(simple.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public int removeElement(int[] nums, int val) {
        int res = 0;
        for(int num: nums) {
            if(num != val) {
                nums[res] = num;
                res++;
            }
        }
        return res;
    }
}
