package cn.xiaoyes.algorithm.day0211;

import cn.xiaoyes.algorithm.utils.Commons;

public class LeetCode860 {
    public static void main(String[] args) {
        LeetCode860 code = new LeetCode860();
        boolean res = code.lemonadeChange(Commons.productArray(5, 5, 5, 10, 20));
        System.out.println(res);
    }


    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for (int b : bills) {
            if (b == 5) {
                five++;
            }
            if (b == 10) {
                if (five <= 0){
                    return false;
                }
                ten++;
                five--;
            }
            if (b == 20) {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                    twenty++;
                } else if (five >= 3) {
                    five -= 3;
                    twenty++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
