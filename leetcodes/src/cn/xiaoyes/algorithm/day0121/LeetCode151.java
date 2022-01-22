package cn.xiaoyes.algorithm.day0121;

public class LeetCode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords2("  hello world  "));
    }

    public static String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--){
            String r = arr[i];
            if (!arr[i].equals("") && i != 0){
                r += " ";
            }
            res.append(r);
        }
        return res.toString();
    }

    public static String reverseWords2(String s){
        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length -1;
        StringBuilder res = new StringBuilder();
        while (array[left] == ' ') left++;
        while(array[right] == ' ') right--;
        while (left <= right){
            int index = right;
            while (index >= left && array[index] != ' ') index--;
            for (int i = index + 1;i <= right;i++) res.append(array[i]);
            if(index > left) res.append(' ');
            while (index > left && array[index] == ' ') index--;
            right = index;
        }
        return res.toString();
    }
}
