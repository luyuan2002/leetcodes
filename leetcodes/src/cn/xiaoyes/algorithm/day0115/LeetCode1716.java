package cn.xiaoyes.algorithm.day0115;

/**
 * 1716.计算力扣银行的钱
 */
public class LeetCode1716 {
    public static void main(String[] args) {
        System.out.println(totalMoney(10));
        System.out.println(totalMoney2(10));
    }
    public static int totalMoney(int n){
        int a = n / 7, b = n % 7;
        int ans = 0, k = 1;
        while (a-- > 0) {
            ans += (k + (k + 6)) * 7 / 2;
            k++;
        }
        while (b-- > 0) ans += k++;
        return ans;
    }

    public static int totalMoney2(int n) {
        int week = 1, day = 1;
        int res = 0;
        for (int i = 0; i < n; ++i) {
            res += week + day - 1;
            ++day;
            if (day == 8) {
                day = 1;
                ++week;
            }
        }
        return res;
    }
}
