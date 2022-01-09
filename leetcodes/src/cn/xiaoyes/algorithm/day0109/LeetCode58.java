package cn.xiaoyes.algorithm.day0109;


public class LeetCode58 {
    public static void main(String[] args) {
        String s = "Hello World ";
        System.out.println(lengthOfLastWord2(s));
    }
    public static int lengthOfLastWord(String s) {
        String[] sts = s.trim().split(" ");
        return sts[sts.length -1].length();
    }

    public static int lengthOfLastWord2(String s){
        int end = s.length() -1;
        while (end >= 0 && s.charAt(end) == ' '){
            end--;
        };
        int start = end;
        while (start >= 0 && s.charAt(start) != ' '){
            start--;
        }
        return end - start;
    }
}
