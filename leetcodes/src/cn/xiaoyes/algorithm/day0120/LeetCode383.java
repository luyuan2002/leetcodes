package cn.xiaoyes.algorithm.day0120;

public class LeetCode383 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()){
            if (--cnt[c - 'a'] < 0) return false;
        }
        return true;
    }
}
