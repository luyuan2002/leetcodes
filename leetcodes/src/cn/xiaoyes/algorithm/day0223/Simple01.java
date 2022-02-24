package cn.xiaoyes.algorithm.day0223;

// 1.定义一个字符串one world one dream，输出第二次出现o的下标是多少？
public class Simple01 {
    public static void main(String[] args) {
        String s = "one world one dream";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o'){
                c++;
            }
            if (c == 2){
                System.out.println(i);
                break;
            }
        }
    }
}
