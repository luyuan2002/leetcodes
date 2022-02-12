package cn.xiaoyes.algorithm.day0212;

public class LeetCode738 {
    public static void main(String[] args) {
        LeetCode738 code = new LeetCode738();
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            int res = code.monotoneIncreasingDigits(332);
            System.out.println("消耗时间: " + (System.nanoTime() - start) + " 结果: " + res);
        }
    }

    public int monotoneIncreasingDigits(int n) {
        for (int i = n; i > 0; i--) {
            if (checkNum(i)) {
                return i;
            }
        }
        return 0;
    }

    public boolean checkNum(int num) {
        int max = 10;
        while (num > 0) {
            int t = num % 10;
            if (max >= t) {
                max = t;
            } else {
                return false;
            }
            num = num / 10;
        }
        return true;
    }

    public int monotoneIncreasingDigits2(int n) {
        if (n == 0) {
            return 0;
        }
        char[] array = Integer.toString(n).toCharArray();
        int start = Integer.MAX_VALUE;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                array[i - 1]--;
                start = i;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '0' && i == 0) {
                continue;
            }
            if (i >= start) {
                res.append('9');
            } else {
                res.append(array[i]);
            }
        }
        return Integer.parseInt(res.toString());
    }
}
