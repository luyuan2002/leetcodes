package cn.xiaoyes.algorithm.day0120;

import java.util.HashSet;
import java.util.Set;

public class LeetCode202 {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy2(2));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNumber(n);
        }
        return n == 1;
    }

    public static boolean isHappy2(int n) {
        int slow = n, fast = n;
        do {
            slow = getNumber(slow);
            fast = getNumber(fast);
            fast = getNumber(fast);
        } while (slow != fast);
        return slow == 1;
    }

    public static int getNumber(int n) {
        int res = 0;
        while (n > 0) {
            int bit = n % 10;
            res += bit * bit;
            n /= 10;
        }
        return res;
    }
}
