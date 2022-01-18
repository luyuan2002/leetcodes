package cn.xiaoyes.algorithm.day0115;

/**
 * 6.Z字形变换
 */
public class LeetCode6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s,int numRows){
        if (numRows == 1){
            return s;
        }
        int len = Math.min(s.length(),numRows);
        String[] rows = new String[len];
        for (int i = 0; i < len; i++) {
            rows[i] = "";
        }
        int loc = 0;
        boolean down = false;
        for (int i = 0; i < s.length(); i++) {
            rows[loc] += s.substring(i,i + 1);
            if (loc == 0 || loc == numRows -1){
                down = !down;
            }
            loc += down ? 1: -1;
        }
        for (String row : rows) {
            System.out.println(row);
        }
        String ans = "";
        for (String row : rows) {
            ans += row;
        }
        return ans;
    }
}
