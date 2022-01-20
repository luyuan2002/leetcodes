package cn.xiaoyes.algorithm.day0120;

public class LeetCode242 {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a'] += 1;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a'] -= 1;
        }
        boolean flag = true;
        for (int val : record) {
            if (val != 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
