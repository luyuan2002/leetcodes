package cn.xiaoyes.algorithm.day0105;

/***
 * LeetCode 1684. 统计一致字符串的数目
 */
public class Simple1684 {
    public static void main(String[] args) {
        System.out.println(countConsistentStrings("cad", new String[]{"cc","acd","b","ba","bac","bad","ac","d"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean f = true;
            for (int c = 0; c < word.length(); c++) {
                if(allowed.indexOf(word.charAt(c))  == -1){
                    f = false;
                    break;
                }
            }
            if (f) {
                count++;
            }
        }
        return count;
    }

}
